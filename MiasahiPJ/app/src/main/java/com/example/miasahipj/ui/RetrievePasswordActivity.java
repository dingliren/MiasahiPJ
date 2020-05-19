package com.example.miasahipj.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.miasahipj.R;


public class RetrievePasswordActivity extends AppCompatActivity {

    private final String CLASS_NAME = "ForgetPasswordActivity";

    private EditText mRetrievePasswordMailEditText;

    private Button mRetrievePasswordReturnButton;

    private Button mRetrievePasswordSubmissionButton;

    private String email_pattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miasahi_retrieve_password_activity);

        initialize();

    }

    private void initialize() {
        mRetrievePasswordMailEditText = findViewById(R.id.retrieve_password_mail_edit_text);

        mRetrievePasswordReturnButton = findViewById(R.id.retrieve_password_return_button);

        mRetrievePasswordSubmissionButton = findViewById(R.id.retrieve_password_submission_button);


        mRetrievePasswordReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mRetrievePasswordSubmissionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkMailStyle()) {
                    //TODO 取得したメールアドレスを発信する
                    mRetrievePasswordMailEditText.getText();
                }
            }
        });
    }

    /**
     * @param keyCode
     * @param event
     * @return
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != KeyEvent.KEYCODE_BACK) {
            return super.onKeyDown(keyCode, event);
        } else {
            finish();
            return false;
        }
    }

    /**
     * メールアドレスチェック.
     *
     * @return
     */
    private boolean checkMailStyle() {
        boolean mailStyle = false;
        if (TextUtils.isEmpty(mRetrievePasswordMailEditText.getText())) {
            Toast.makeText(this,"メール未入力",Toast.LENGTH_SHORT).show();
            return false;
        }

        String mailAddress = mRetrievePasswordMailEditText.getText().toString();

        if (mailAddress.matches(email_pattern)) {
            Toast.makeText(this,"メールチェックTRUE",Toast.LENGTH_SHORT).show();
            //TODO 入力したメールアドレスがDBに保存されているかどうかチェック

            mailStyle = true;
        } else {
            Toast.makeText(this,"メールチェックFALSE",Toast.LENGTH_SHORT).show();
            return false;
        }
        return mailStyle;
    }

}
