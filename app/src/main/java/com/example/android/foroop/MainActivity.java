package com.example.android.foroop;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView=new TextView(this);
        textView.setText("Naghaaaam ");
        textView.setTextColor(Color.MAGENTA);
        textView.setTextSize(40);
        textView.setMaxLines(2);//for make lines only 2

        setContentView(textView);
    }
}
