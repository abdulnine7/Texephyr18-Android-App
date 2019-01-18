package com.abdul.app.texephyr;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Abdul Noushad (abdulnine7)
 */

public class FragmentSponsors extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View v = inflater.inflate(R.layout.sponsors_fragment, container, false);
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.sponsors_fragment, container, false);
    }
}
