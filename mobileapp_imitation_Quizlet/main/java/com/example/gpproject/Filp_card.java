package com.example.gpproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Filp_card extends AppCompatActivity {
TextView title,word,define;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filp_card);
        CardView c1=findViewById(R.id.c1);
        CardView c2 =findViewById(R.id.c2);
        ImageButton back=findViewById(R.id.filpcard_backbtn);
        title=findViewById(R.id.filp_card_title);
        word=findViewById(R.id.filp_card_word);
        define=findViewById(R.id.filp_card_define);
        ImageView pre=findViewById(R.id.pre);
        ImageView next =findViewById(R.id.next);

        if (gloVAR.T1clicked){
            title.setText(gloVAR.s1T);
            word.setText(gloVAR.s1W1);
            define.setText(gloVAR.s1D1);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    word.setText(gloVAR.s1W2);
                    define.setText(gloVAR.s1D2);
                }
            });
            pre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    word.setText(gloVAR.s1W1);
                    define.setText(gloVAR.s1D1);
                }
            });
        }
        if (gloVAR.T2clicked){
            title.setText(gloVAR.s2T);
            word.setText(gloVAR.s2W1);
            define.setText(gloVAR.s2D1);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    word.setText(gloVAR.s2W2);
                    define.setText(gloVAR.s2D2);
                }
            });
            pre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    word.setText(gloVAR.s2W1);
                    define.setText(gloVAR.s2D1);
                }
            });
        }

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.animate().rotationX(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        c1.setVisibility(View.GONE);
                        c2.setRotationX(-90);
                        c2.setVisibility(View.VISIBLE);
                        c2.animate().rotationX(0).setDuration(200).setListener(null);
                    }
                });
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2.animate().rotationX(90).setDuration(200).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        c2.setVisibility(View.GONE);
                        c1.setRotationX(-90);
                        c1.setVisibility(View.VISIBLE);
                        c1.animate().rotationX(0).setDuration(200).setListener(null);
                    }
                });
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(gloVAR.T1clicked){
                gloVAR.T1clicked=false;
                   finish();}
               else if (gloVAR.T2clicked) {
                   gloVAR.T2clicked=false;
                   finish();
               }
            }
        });
    }

}
