package com.louis.bmi;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editWeight;
    private EditText editHeight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        editWeight = findViewById(R.id.ed_weight);
        editHeight = findViewById(R.id.ed_height);
        result = findViewById(R.id.result);
        Button help = findViewById(R.id.button_help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Help")
                        .setMessage("身體質量指數（英語：Body Mass Index，簡稱BMI）又稱凱特萊指數（Quetelet index，/kɛtəˈleɪ/[1]），" +
                                "簡稱體質指數[2]，是由一個人的質量（體重）和身高計算出的一個數值。" +
                                "BMI的定義是體重除以身高的平方，以千克/平方公尺為單位表示，由質量（千克）和身高（公尺）得出")
                        .setPositiveButton("OK",null)
                        .show();
            }
        });
    }

    public void bmi(View view){
        String w = editWeight.getText().toString();
        String h = editHeight.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity", "BMI:"+bmi);
        Toast.makeText(this,"Your BMI is : "+bmi,Toast.LENGTH_LONG).show();
        result.setText("Your BMI is : " + bmi);
        new AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage(String.valueOf(bmi))
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        editWeight.setText("");
                        editHeight.setText("");
                    }
                })
                .show();
    }

}