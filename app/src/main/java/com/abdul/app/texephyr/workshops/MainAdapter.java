package com.abdul.app.texephyr.workshops;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.abdul.app.texephyr.R;
import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter;
import com.afollestad.sectionedrecyclerview.SectionedViewHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Abdul Noushad (abdulnine7)
 */
@SuppressLint("DefaultLocale")
class MainAdapter extends SectionedRecyclerViewAdapter<MainAdapter.MainVH> {

    private final Map<String, List<Workshop>> events;
    private final List<String> depts;
    private final Context context;

    MainAdapter(Context context, Map<String, List<Workshop>> events) {
        this.context = context;
        this.events = events;
        this.depts = new ArrayList<>(events.keySet());

        collapseAllSections();
        Collections.sort(this.depts);
    }

    @Override
    public int getSectionCount() {
        return depts.size();
    }

    @Override
    public int getItemCount(int section) {
        return events.get(depts.get(section)).size();
    }

    @Override
    public void onBindHeaderViewHolder(MainVH holder, int section, boolean expanded) {
        String dept = depts.get(section);
        holder.title.setText(dept);
        holder.caret.setImageResource(expanded ? R.drawable.ic_collapse : R.drawable.ic_expand);
    }

    @Override
    public void onBindFooterViewHolder(MainVH holder, int section) {
        holder.title.setText(String.format("Section footer %d", section));
    }

    @Override
    public void onBindViewHolder(MainVH holder, int section, int relativePosition, int absolutePosition) {
        Workshop workshop = events.get(depts.get(section)).get(relativePosition);
        holder.title.setText(workshop.title);
        holder.text.setText(workshop.shortText);
    }

    @Override
    public int getItemViewType(int section, int relativePosition, int absolutePosition) {
        return super.getItemViewType(section, relativePosition, absolutePosition);
    }

    @Override
    public MainVH onCreateViewHolder(ViewGroup parent, int viewType) {
        int layout = 0;
        switch (viewType) {
            case VIEW_TYPE_HEADER:
                layout = R.layout.list_item_header;
                break;
            case VIEW_TYPE_ITEM:
                layout = R.layout.list_item_main;
                break;
            case VIEW_TYPE_FOOTER:
                layout = R.layout.list_item_footer;
                break;
            default:
                break;
        }

        View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        return new MainVH(v, this);
    }

    public class MainVH extends SectionedViewHolder implements View.OnClickListener {

        final TextView title;
        final TextView text;
        final ImageView caret;
        final MainAdapter adapter;

        MainVH(View itemView, MainAdapter adapter) {
            super(itemView);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.text = (TextView) itemView.findViewById(R.id.text);
            this.caret = (ImageView) itemView.findViewById(R.id.caret);
            this.adapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            if (isHeader()) {
                adapter.toggleSectionExpanded(getRelativePosition().section());
            } else {
                int section = getRelativePosition().section();
                int relapos = getRelativePosition().relativePos();
                Workshop workshop = events.get(depts.get(section)).get(relapos);

                context.startActivity(new Intent(context, WorkshopActivity.class)
                        .putExtra("title", workshop.title)
                        .putExtra("text", workshop.text));

            }
        }
    }
}
