package com.abdul.app.texephyr;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import static com.android.gifts.bottomnavigation.R.id.container;

/**
 * @author Abdul Noushad (abdulnine7)
 */

public class FragmentAboutTex extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.about_tex_fragment, container, false);

        TextView about_tex = (TextView) v.findViewById(R.id.about_texephyr);
        about_tex.setText("TEXEPHYR is MIT Pune’s National level technical fest. Texephyr’17 witnessed " +
                "participations in huge numbers in a varied array of technical and non-technical events. " +
                "IDRL being held for the first time in Maharashtra & rally mania were the star attraction " +
                "of our event. Texephyr has been inspiring the minds of young students, igniting them to " +
                "conquer the challenges faced today and innovating solutions that will flow a fresh wind " +
                "of change for development of society as well as themselves. To encourage more participation " +
                "and inculcate knowledge there was a large sum of cash prize .Enthralling workshops by CDAC, " +
                "Skyfi Labs, Geek’s Lab, F1 Race Participants and many more were organised to upskill the " +
                "students and expand their Capabilities. \n\n" +
                "Continuing our tradition we are back with the 5th edition TEXEPHYR’18 to support " +
                "A.P.J. Abdul Kalam’s Vision 2020. Be a part of TEXEPHYR’18 to indulge and witness " +
                "this exciting festival.");

        TextView link = (TextView) v.findViewById(R.id.about_website);
        String linkText = "Visit the <a href='http://www.texephyr.in'>Official Website</a> of Texephyr '18.";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());

        return v;
    }
}
