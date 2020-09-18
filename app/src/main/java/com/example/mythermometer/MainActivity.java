package com.example.mythermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView input;
    TextView result;
    Double d;
    Double f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        result = findViewById(R.id.result);

    }

    public void clickButton(View view){
        d = Double.parseDouble(input.getText().toString());
        f = 32.0+d*1.8;
        result.setText("华氏温度是："+f.toString()+" °F");

    }
}