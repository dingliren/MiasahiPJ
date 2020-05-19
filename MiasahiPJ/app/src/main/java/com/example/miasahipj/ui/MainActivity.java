package com.example.miasahipj.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.miasahipj.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;


    private Btn1Fragment mBtn1Fragment;
    private Btn2Fragment mBtn2Fragment;
    private Btn3Fragment mBtn3Fragment;
    private Btn4Fragment mBtn4Fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miasahi_main_activity);

        mFragmentManager = getSupportFragmentManager();

        mBtn1Fragment = new Btn1Fragment();
        mBtn2Fragment = new Btn2Fragment();
        mBtn3Fragment = new Btn3Fragment();
        mBtn4Fragment = new Btn4Fragment();

        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.container_layout,mBtn1Fragment);
        fragmentTransaction.commit();



    }

    /**
     * Btn1のクリック処理.
     */
    public void setOnClickBtn1(View view){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container_layout,mBtn1Fragment);
        fragmentTransaction.commit();

    }

    /**
     * Btn2のクリック処理.
     */
    public void setOnClickBtn2(View view){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container_layout,mBtn2Fragment);
        fragmentTransaction.commit();

    }

    /**
     * Btn3のクリック処理.
     */
    public void setOnClickBtn3(View view){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container_layout,mBtn3Fragment);
        fragmentTransaction.commit();

    }

    /**
     * Btn4のクリック処理.
     */
    public void setOnClickBtn4(View view){
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.container_layout,mBtn4Fragment);
        fragmentTransaction.commit();

    }





    /**
     * バックキーの押下処理.
     *
     * @param keyCode
     * @param event
     * @return
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != KeyEvent.KEYCODE_BACK){
            return super.onKeyDown(keyCode, event);
        }else{
            Toast.makeText(this,"この画面のバックキーは無効です。",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
