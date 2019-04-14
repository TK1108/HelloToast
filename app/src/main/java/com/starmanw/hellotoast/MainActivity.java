package com.starmanw.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Properties
    private Button btnSayHello;
    private TextView txtCount;
    private Button btnCount;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        initUI();
    }

    /**
     * Initialize UI components
     */
    private void initUI() {
        btnSayHello = findViewById(R.id.btnSayHello);
        txtCount = findViewById(R.id.txtViewCount);
        btnCount = findViewById(R.id.btnCount);
    }

    /**
     * Increment Counter
     * @param view
     */
    public void incrementCount(View view) {
        counter++;
        txtCount.setText(String.valueOf(counter));
    }

    /**
     * Start HelloActivity
     * @param view
     */
    public void sayHello(View view) {
        Intent intent = new Intent(getApplicationContext(), HelloActivity.class);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }
}
