package com.abdul.app.texephyr.events;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.abdul.app.texephyr.R;


/**
 * @author Abdul Noushad (abdulnine7)
 */
public class FragmentEvent extends Fragment {

    private MainAdapter adapter;
    private boolean hideEmpty;
    private boolean showFooters = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.event_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recycler = (RecyclerView) view.findViewById(R.id.list);
        adapter = new MainAdapter(getActivity(), Event.getEvents());
        LinearLayoutManager manager =
                new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(manager);
        adapter.shouldShowHeadersForEmptySections(hideEmpty);
        adapter.shouldShowFooters(showFooters);
        recycler.setAdapter(adapter);
    }
}
