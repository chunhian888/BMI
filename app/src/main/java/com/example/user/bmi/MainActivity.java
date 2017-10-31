package com.example.user.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText editWeight, editHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Linking UI to programme
        editWeight = (EditText)findViewById(R.id.editWeight);
        editHeight = (EditText)findViewById(R.id.editHeight);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
    }

    public void CalculateBMI(View view){
        double weight, height, bmi;
        weight = Double.parseDouble(editWeight.getText().toString());
        height = Double.parseDouble(editHeight.getText().toString());
        bmi = weight / (height*height);

        if( bmi <= 18.5){
            textViewResult.setText(bmi + " Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(bmi >18.5 && bmi <21){
            textViewResult.setText(bmi + " Normal Weight");
            imageViewResult.setImageResource(R.drawable.normal);
        }
        else if(bmi >= 21){
            textViewResult.setText(bmi + " Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
        else{
            textViewResult.setText("No result");
        }

    }
}
