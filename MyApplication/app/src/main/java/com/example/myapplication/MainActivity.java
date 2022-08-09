package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview1 = findViewById(R.id.textView1);
        TextView textview2 = findViewById(R.id.textview2);
        EditText edittext1 = findViewById(R.id.edittext1);
        EditText edittext2 = findViewById(R.id.edittext2);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edittext1.getText().toString());
                int num2 = Integer.parseInt(edittext2.getText().toString());
                int button = num1 + num2;
                textview2.setText(String.valueOf(button));
            }
        });
    }
}