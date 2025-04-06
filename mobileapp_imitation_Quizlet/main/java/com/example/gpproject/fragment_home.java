package com.example.gpproject;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class fragment_home extends Fragment {
    private View v;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1,mParam2;

    public fragment_home() {}

    public static fragment_home newInstance(String param1, String param2) {
        fragment_home fragment = new fragment_home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home, container, false);
        TextView sst1 = v.findViewById(R.id.StudysetT1);
        TextView sst1A = v.findViewById(R.id.T1_author);
        TextView sst2 = v.findViewById(R.id.StudysetT2);
        TextView sst2A = v.findViewById(R.id.T2_author);
        ImageButton ss_del1 = v.findViewById(R.id.Study_set_del);
        ImageButton ss_del2 = v.findViewById(R.id.study_set_del2);
        CardView c1=v.findViewById(R.id.home_C1);
        CardView c2=v.findViewById(R.id.home_C2);

        ss_del1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gloVAR.s1T = null;
                gloVAR.s1W1 = null;
                gloVAR.s1D1 = null;
                gloVAR.s1W2 = null;
                gloVAR.s1D2 = null;
                sst1.setText("Empty");
                sst1A.setText("");
                Toast.makeText(getContext(), "Set 1 have been deleted", Toast.LENGTH_SHORT).show();
            }
        });
        ss_del2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gloVAR.s2T = null;
                gloVAR.s2W1 = null;
                gloVAR.s2D1 = null;
                gloVAR.s2W2 = null;
                gloVAR.s2D2 = null;
                sst2.setText("Empty");
                sst2A.setText("");
                Toast.makeText(getContext(), "Set 2 have been deleted", Toast.LENGTH_SHORT).show();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchc1();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchc2();
            }
        });

        if (gloVAR.s1T == null) {
            sst1.setText("Empty");
        } else {
            sst1.setText(gloVAR.s1T);
            sst1A.setText("By " + gloVAR.Username);
        }

        if (gloVAR.s2T == null) {
            sst2.setText("Empty");
        } else {
            sst2.setText(gloVAR.s2T);
            sst2A.setText("By " + gloVAR.Username);
        }
        notifyButton();
        achbutton();
        return v;
    }

    private void notifyButton() {
        ImageButton btn = (ImageButton) v.findViewById(R.id.inform);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(), setnotifi_from_frag_home.class);
                startActivity(intent);
            }
        });
    }

    private void achbutton() {
        ImageButton im_ach = (ImageButton) v.findViewById(R.id.im_ach);
        im_ach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(),achievement.class);
                startActivity(intent);
            }
        });
    }
    private void touchc1() {
        if (gloVAR.s1T!=null)   {
        Intent intent = new Intent();
                intent.setClass(getContext(),Filp_card.class);
                gloVAR.T1clicked=true;
                startActivity(intent);
        }else {
            Toast.makeText(getContext(), "This is empty", Toast.LENGTH_SHORT).show();
        }
    }
    private void touchc2() {
        if (gloVAR.s2T!=null){
        Intent intent = new Intent();
        intent.setClass(getContext(),Filp_card.class);
        gloVAR.T2clicked=true;
        startActivity(intent);
        } else {
            Toast.makeText(getContext(), "This is empty", Toast.LENGTH_SHORT).show();
        }
    }
}







