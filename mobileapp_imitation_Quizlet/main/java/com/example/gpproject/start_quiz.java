package com.example.gpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class start_quiz extends AppCompatActivity {
    ImageButton back;
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        final LinearLayout math = findViewById(R.id.math_Layout);
        final LinearLayout english = findViewById(R.id.english_Layout);
        final LinearLayout it = findViewById(R.id.it_Layout);
        final LinearLayout android = findViewById(R.id.android_Layout);

        final Button startBtn = findViewById(R.id.startQuizBtn);
        back=findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Math";
                math.setBackgroundResource(R.drawable.round_back_white_stroke10);
                english.setBackgroundResource(R.drawable.round_back_white10);
                it.setBackgroundResource(R.drawable.round_back_white20);
                android.setBackgroundResource(R.drawable.round_back_white20);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "English";
                english.setBackgroundResource(R.drawable.round_back_white_stroke10);
                math.setBackgroundResource(R.drawable.round_back_white10);
                it.setBackgroundResource(R.drawable.round_back_white20);
                android.setBackgroundResource(R.drawable.round_back_white20);
            }
        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "IT";
                it.setBackgroundResource(R.drawable.round_back_white_stroke10);
                math.setBackgroundResource(R.drawable.round_back_white10);
                english.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white20);
            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "Android";
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);
                math.setBackgroundResource(R.drawable.round_back_white10);
                it.setBackgroundResource(R.drawable.round_back_white20);
                english.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(start_quiz.this, "Please select topic", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(start_quiz.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}