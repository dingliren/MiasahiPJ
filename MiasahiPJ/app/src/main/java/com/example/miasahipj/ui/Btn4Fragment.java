package com.example.miasahipj.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.miasahipj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Btn4Fragment extends Fragment {

    private final String CLASS_NAME = "Btn4Fragment";

    private FragmentManager mFragmentManager;

    private Button mProfileUpdateBtn;

    private ProfileUpdateFragment mProfileUpdateFragment;

    public Btn4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_btn4, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFragmentManager = getFragmentManager();
        mProfileUpdateFragment = new ProfileUpdateFragment();


        mProfileUpdateBtn = getActivity().findViewById(R.id.profile_update_btn);

        mProfileUpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.container_layout,mProfileUpdateFragment);
                fragmentTransaction.commit();
            }
        });

    }
}
