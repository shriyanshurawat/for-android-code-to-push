package com.example.welcomeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the TextView and Button
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // Set an OnClickListener on the Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display the message in the TextView
                textView.setText("Welcome to Graphic Era");
                textView.setVisibility(View.VISIBLE);
            }
        });
    }
}
