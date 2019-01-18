package com.abdul.app.texephyr;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abdul.app.texephyr.events.FragmentEvent;
import com.abdul.app.texephyr.workshops.FragmentWorkshop;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

/**
 * @author Abdul Noushad (abdulnine7)
 */
public class ThreeButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buttons);

        getSupportActionBar().setTitle("MIT WPU Texephyr '19");

        getFragmentManager().beginTransaction().replace(R.id.frag_container, new FragmentEvent()).commit();

        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.noTopOffset();
        bottomBar.noNavBarGoodness();
        bottomBar.setItemsFromMenu(R.menu.five_buttons_menu, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(int itemId) {

                switch (itemId) {
                    case R.id.tab_event:

                        FragmentEvent fe = new FragmentEvent();
                        getFragmentManager().beginTransaction().replace(R.id.frag_container, fe).commit();
                        break;

                    case R.id.tab_workshop:
                        FragmentWorkshop fw = new FragmentWorkshop();
                        getFragmentManager().beginTransaction().replace(R.id.frag_container, fw).commit();
                        break;

                    case R.id.tab_about:
                        FragmentAboutTex fa = new FragmentAboutTex();
                        getFragmentManager().beginTransaction().replace(R.id.frag_container, fa).commit();
                        break;

                    case R.id.tab_sponsor:
                        FragmentSponsors fs = new FragmentSponsors();
                        getFragmentManager().beginTransaction().replace(R.id.frag_container, fs).commit();
                        break;

                    case R.id.tab_more:
                        FragmentMore fm = new FragmentMore();
                        getFragmentManager().beginTransaction().replace(R.id.frag_container, fm).commit();
                        break;
                }
            }
        });

        // Set the color for the active tab. Ignored on mobile when there are more than three tabs.
        bottomBar.setActiveTabColor("#C2185B");

        // Use the dark theme. Ignored on mobile when there are more than three tabs.
        //bottomBar.useDarkTheme(true);

        // Use custom text appearance in tab titles.
        //bottomBar.setTextAppearance(R.style.MyTextAppearance);

        // Use custom typeface that's located at the "/src/main/assets" directory. If using with
        // custom text appearance, set the text appearance first.
        //bottomBar.setTypeFace("MyFont.ttf");
    }
}
