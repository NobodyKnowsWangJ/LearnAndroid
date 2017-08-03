package com.example.littletwo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private float firstNumber;
    private float secondNumber;
    private float calculateNumber;
    private int calculateMethod;
    private String showString;
    private TextView mTextView;
    private Boolean shouldClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.calculateResultView);
        shouldClear = false;
        showString = "0";
        calculateMethod = 0;
        firstNumber = 0;
        secondNumber = 0;
        resignClickListener();
    }

    @Override
    public void  onClick(View v){
        int touchID = v.getId();
        for (int i = 0;i < calculateNumberSets.length;i ++){
            int id = calculateNumberSets[i];
            if (touchID==id){
                if (i==calculateNumberSets.length-1){
                    if (!showString.contains("."))showString += ".";
                }else if(showString.equals("0")){
                    if (i != 0){
                        showString = String.valueOf(i);
                    }
                } else {
                    showString += String.valueOf(i);
                }
                mTextView.setText(showString);
            }
        }
        switch (v.getId()){
            case R.id.calculator_btn_clear:{
                showString = "0";
                mTextView.setText(showString);
            }
        }
    }

    private void resignClickListener(){
        for (int i = 0;i < calculateNumberSets.length;i ++){
            int id = calculateNumberSets[i];
            findViewById(id).setOnClickListener(this);
        }

        for (int i = 0;i< calculateMethodSets.length;i ++){
            int id = calculateMethodSets[i];
            findViewById(id).setOnClickListener(this);
        }

        for (int i:calculateMethodSets
             ) {

        }

        for (int i = 0;i < viewIds.length;i ++){
            int id = viewIds[i];
            findViewById(id).setOnClickListener(this);
        }
    }

    private int[] calculateNumberSets = new int[]{
            R.id.calculator_btn_zero,
            R.id.calculator_btn_one,
            R.id.calculator_btn_two,
            R.id.calculator_btn_three,
            R.id.calculator_btn_four,
            R.id.calculator_btn_five,
            R.id.calculator_btn_six,
            R.id.calculator_btn_seven,
            R.id.calculator_btn_eight,
            R.id.calculator_btn_nighn,
            R.id.calculator_btn_point
    };

    private int[] calculateMethodSets = new int[]{
            R.id.calculator_btn_cheng,
            R.id.calculator_btn_chu,
            R.id.calculator_btn_reduce,
            R.id.calculator_btn_jia,
            R.id.calculator_btn_equl,
            R.id.calculator_btn_manuce
    };

    private int[] viewIds = new int[]{
            R.id.calculator_btn_madd,
            R.id.calculator_btn_mcache,
            R.id.calculator_btn_mreduce,
            R.id.calculator_btn_mremember,
            R.id.calculator_btn_clear
    };
}
