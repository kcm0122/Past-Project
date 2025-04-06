package com.example.gpproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fragment_addfile extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1,mParam2;
    public fragment_addfile() {}

    public static fragment_addfile newInstance(String param1, String param2) {
        fragment_addfile fragment = new fragment_addfile();
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
        View v=inflater.inflate(R.layout.fragment_addfile, container, false);
        EditText ed1,ed2,ed3,ed4,ed5;
        ed1=v.findViewById(R.id.addfile_et_title);
        ed2=v.findViewById(R.id.addfile_et_word1);
        ed3=v.findViewById(R.id.addfile_et_define1);
        ed4=v.findViewById(R.id.addfile_et_word2);
        ed5=v.findViewById(R.id.addfile_et_define2);
        Button save=v.findViewById(R.id.savebtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (gloVAR.s1T==null){
                   gloVAR.s1T=ed1.getText().toString();
                   gloVAR.s1W1=ed2.getText().toString();
                   gloVAR.s1D1=ed3.getText().toString();
                   gloVAR.s1W2=ed4.getText().toString();
                   gloVAR.s1D2=ed5.getText().toString();
                   getFragmentManager()
                           .beginTransaction()
                           .replace(R.id.framelayout_navbar, new fragment_home())
                           .commit();
               } else if (gloVAR.s1T!=null && gloVAR.s2T==null) {
                   gloVAR.s2T=ed1.getText().toString();
                   gloVAR.s2W1=ed2.getText().toString();
                   gloVAR.s2D1=ed3.getText().toString();
                   gloVAR.s2W2=ed4.getText().toString();
                   gloVAR.s2D2=ed5.getText().toString();
                   getFragmentManager()
                           .beginTransaction()
                           .replace(R.id.framelayout_navbar, new fragment_home())
                           .commit();
               }else{
                   Toast.makeText(getContext(), "no space", Toast.LENGTH_SHORT).show();
               }

            }
        });
        return v;
    }
}