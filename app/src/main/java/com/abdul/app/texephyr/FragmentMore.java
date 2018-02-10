package com.abdul.app.texephyr;


import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * @author Abdul Noushad (abdulnine7)
 */

public class FragmentMore extends ListFragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.more_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.moreTabs, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        Intent myIntent;
        //Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT).show();
        if (position == 0) {
            myIntent = new Intent(view.getContext(), WebActivity.class);
            myIntent.putExtra("action", "0");
            startActivityForResult(myIntent, 0);
        }

        if (position == 1) {
            myIntent = new Intent(view.getContext(), DevelopmentTeam.class);
            startActivityForResult(myIntent, 0);
        }
        if (position == 2) {
            myIntent = new Intent(view.getContext(), WebActivity.class);
            myIntent.putExtra("action", "1");
            startActivityForResult(myIntent, 0);
        }
        if (position == 3) {
            Uri gmmIntentUri = Uri.parse("geo:18.5181,73.8150?q=Maharashtra Institute Of Technology, Pune");
            myIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            myIntent.setPackage("com.google.android.apps.maps");
            if (myIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(myIntent);
            }
        }
        if (position == 4) {
            myIntent = new Intent(view.getContext(), ContactTeam.class);
            startActivityForResult(myIntent, 0);
        }

    }


}
