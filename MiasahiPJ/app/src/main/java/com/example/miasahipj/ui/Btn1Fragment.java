package com.example.miasahipj.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miasahipj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Btn1Fragment extends Fragment {

    public Btn1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btn1,container,false);
    }
}
