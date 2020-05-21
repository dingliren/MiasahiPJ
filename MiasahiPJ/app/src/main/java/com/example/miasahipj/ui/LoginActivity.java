package com.example.miasahipj.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.miasahipj.R;

/**
 * ログインActivity.
 */
public class LoginActivity extends AppCompatActivity {

    private final String CLASS_NAME = "LoginActivity";

    private ImageView mLoginIconImageView;

    private EditText mLoginUserNameEditText;

    private EditText mLoginPasswordEditText;

    private Button mLoginLoginButton;

    private TextView mLoginRetrievePasswordText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miasahi_login_activity);
        initialize();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * 初期化
     */
    private void initialize(){
        mLoginIconImageView = findViewById(R.id.login_imageview);
        mLoginUserNameEditText = findViewById(R.id.login_pass_word_edit_text);
        mLoginPasswordEditText = findViewById(R.id.login_pass_word_edit_text);
        mLoginLoginButton = findViewById(R.id.login_login_button);
        mLoginRetrievePasswordText = findViewById(R.id.login_forget_pass_word_text);

        mLoginLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        mLoginRetrievePasswordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RetrievePasswordActivity.class);
                startActivity(intent);
            }
        });


    }


    /**
     *
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
