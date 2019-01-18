package com.abdul.app.texephyr.workshops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.abdul.app.texephyr.R;

/**
 * @author Abdul Noushad (abdulnine7)
 */
public class WorkshopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_workshop);

        ((TextView) findViewById(R.id.title)).setText(getIntent().getStringExtra("title"));
        ((TextView) findViewById(R.id.text)).setText(getIntent().getStringExtra("text"));
    }
}
