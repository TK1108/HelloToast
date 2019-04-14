package com.starmanw.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    // Properties
    private TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        initUI();
    }

    /**
     * Initialize UI components
     */
    private void initUI() {
        txtCount = findViewById(R.id.txtCount);
        txtCount.setText(String.format(getString(R.string.txtView), getIntent().getIntExtra("counter", 0)));
    }

    /**
     * Instead of pause, destroy the activity because
     * it's no longer used.
     */
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
