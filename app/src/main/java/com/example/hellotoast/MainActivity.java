package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button countButton;
    private Button toastButton;
    private TextView textView;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countButton= findViewById(R.id.button_count);
        toastButton= findViewById(R.id.button_toast);
        textView= findViewById(R.id.count_text);
        toastButton.setOnClickListener(this);
        countButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_toast){
            Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_LONG).show();
        }else if(v.getId() == R.id.button_count){
            count++;
            Log.d("MainActivity",""+count);
            textView.setText(""+count);
        }

    }
}