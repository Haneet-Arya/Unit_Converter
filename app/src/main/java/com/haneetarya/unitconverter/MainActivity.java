package com.haneetarya.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Convertbutton);
        textView = findViewById(R.id.outputText);
        inputText = findViewById(R.id.KgValue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
                String s = inputText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205*kg;
                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);
                double poundF = Double.parseDouble(df.format(pound));
                textView.setText("The Corresponding value in pound is " + poundF);
            }
        });
    }
}