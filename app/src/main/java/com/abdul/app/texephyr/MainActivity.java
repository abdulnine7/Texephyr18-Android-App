package com.abdul.app.texephyr;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @author Abdul Noushad (abdulnine7)
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView heading = (TextView) findViewById(R.id.aptex);
        Typeface face = Typeface.createFromAsset(getAssets(), "sofachrome.ttf");
        assert heading != null;
        heading.setTypeface(face);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ThreeButtonsActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}