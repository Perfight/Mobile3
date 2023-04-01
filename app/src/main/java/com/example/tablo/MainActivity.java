package com.example.tablo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String SCORE_1 = "SCORE_1";
    private static final String SCORE_2 = "SCORE_2";
    private int score_1 = 0;
    private int score_2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_1, score_1);
        outState.putInt(SCORE_2, score_2);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score_1 = savedInstanceState.getInt(SCORE_1);
        TextView scoreView_1 = findViewById(R.id.score_1);
        scoreView_1.setText(String.valueOf(this.score_1));
        score_2 = savedInstanceState.getInt(SCORE_2);
        TextView scoreView_2 = findViewById(R.id.score_2);
        scoreView_2.setText(String.valueOf(this.score_2));
    }


    public void OnClickBtnAddScore_1(View view) {
        score_1 ++;
        TextView scoreView_1 = findViewById(R.id.score_1);
        scoreView_1.setText(String.valueOf(score_1));
    }

    public void OnClickBtnAddScore_2(View view) {
        score_2 ++;
        TextView scoreView_2 = findViewById(R.id.score_2);
        scoreView_2.setText(String.valueOf(score_2));
    }

    public void OnClickBtnResetScore(View view){
        score_1 = 0;
        TextView scoreView_1 = findViewById(R.id.score_1);
        scoreView_1.setText(String.valueOf(score_1));
        score_2 = 0;
        TextView scoreView_2 = findViewById(R.id.score_2);
        scoreView_2.setText(String.valueOf(score_2));
    }

}