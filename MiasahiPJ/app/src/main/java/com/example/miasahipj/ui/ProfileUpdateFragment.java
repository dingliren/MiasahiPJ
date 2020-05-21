package com.example.miasahipj.ui;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.miasahipj.R;

/**
 * A simple {@link Fragment} subclass.
 *
 * 個人情報更新Fragment.
 */
public class ProfileUpdateFragment extends Fragment {
    private String CLASS_NAME = "ProfileUpdateFragment";

    /**
     * 戻るボタン.
     */
    private Button mProfileUpdateBackBtn;

    /**
     * 更新ボタン.
     */
    private Button mProfileUpdateUpdateBtn;

    /**
     * 個人情報：メールアドレス.
     */
    private EditText mProfileUpdateMailAddressInput;

    /**
     * 個人情報：誕生日.
     */
    private EditText mProfileUpdateBirthdayInput;

    /**
     * 個人情報：星座.
     */
    private TextView mProfileUpdateSignInput;

    /**
     * 個人情報：郵便番号.
     */
    private EditText mProfileUpdatePostalCodeInput;

    /**
     * 個人情報：住所.
     */
    private EditText mProfileUpdateStreetAddressInput;

    /**
     * 個人情報：最寄り駅.
     */
    private EditText mProfileUpdateStationInput;

    /**
     * 個人情報：電話番号.
     */
    private EditText mProfileUpdatePhoneInput;

    /**
     * 緊急連絡先：関係(日本).
     */
    private EditText mProfileUpdateJapanRelationInput;

    /**
     * 緊急連絡先：名前（日本）
     */
    private EditText mProfileUpdateJapanEmergencyNameInput;

    /**
     * 緊急連絡先：電話番号（日本）
     */
    private EditText mProfileUpdateJapanEmergencyPhoneInput;

    /**
     * 緊急連絡先：関係(中国).
     */
    private EditText mProfileUpdateChinaRelationInput;

    /**
     * 緊急連絡先：名前（中国）
     */
    private EditText mProfileUpdateChinaEmergencyNameInput;

    /**
     * 緊急連絡先：電話番号（中国）
     */
    private EditText mProfileUpdateChinaEmergencyPhoneInput;

    /**
     * 個人情報：在留カード期間.
     */
    private EditText mProfileUpdateResidenceCardInput;

    /**
     * 個人情報；パスポート期間.
     */
    private EditText mProfileUpdatePassportInput;

    private int mErrorCheckCount = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_update, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
        inputItemReset();

        mProfileUpdateBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"戻る",Toast.LENGTH_SHORT).show();
                getFragmentManager().popBackStack();
            }
        });


        mProfileUpdateUpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputItemReset();
                if (itemInputCheck()) {
                    Toast.makeText(getContext(), "更新", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });


    }

    /**
     * 初期化処理.
     */
    private void init() {
        //ボタン
        mProfileUpdateBackBtn = getActivity().findViewById(R.id.profile_update_back_btn);
        mProfileUpdateUpdateBtn = getActivity().findViewById(R.id.profile_update_update_btn);
        //入力欄
        mProfileUpdateMailAddressInput = getActivity().findViewById(R.id.profile_update_mail_address_input);
        mProfileUpdateBirthdayInput = getActivity().findViewById(R.id.profile_update_birthday_input);
        mProfileUpdateSignInput = getActivity().findViewById(R.id.profile_update_sign_input);
        mProfileUpdatePostalCodeInput = getActivity().findViewById(R.id.profile_update_postal_code_input);
        mProfileUpdateStreetAddressInput = getActivity().findViewById(R.id.profile_update_street_address_input);
        mProfileUpdateStationInput = getActivity().findViewById(R.id.profile_update_station_input);
        mProfileUpdatePhoneInput = getActivity().findViewById(R.id.profile_update_phone_input);
        mProfileUpdateJapanRelationInput = getActivity().findViewById(R.id.profile_update_japan_relation_input);
        mProfileUpdateJapanEmergencyNameInput = getActivity().findViewById(R.id.profile_update_japan_emergency_name_input);
        mProfileUpdateJapanEmergencyPhoneInput = getActivity().findViewById(R.id.profile_update_japan_emergency_phone_input);
        mProfileUpdateChinaRelationInput = getActivity().findViewById(R.id.profile_update_china_relation_input);
        mProfileUpdateChinaEmergencyNameInput = getActivity().findViewById(R.id.profile_update_china_emergency_name_input);
        mProfileUpdateChinaEmergencyPhoneInput = getActivity().findViewById(R.id.profile_update_china_emergency_phone_input);
        mProfileUpdateResidenceCardInput = getActivity().findViewById(R.id.profile_update_residence_card_input);
        mProfileUpdatePassportInput = getActivity().findViewById(R.id.profile_update_passport_input);
    }

    /**
     * 入力項目の必須チェック.
     *
     * @return true:異常なし　false:異常
     */
    private boolean itemInputCheck() {
        if (TextUtils.isEmpty(mProfileUpdateMailAddressInput.getText())) {
            mProfileUpdateMailAddressInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateBirthdayInput.getText())) {
            mProfileUpdateBirthdayInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateSignInput.getText())) {
            mProfileUpdateSignInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdatePostalCodeInput.getText())) {
            mProfileUpdatePostalCodeInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateStreetAddressInput.getText())) {
            mProfileUpdateStreetAddressInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }


        if (TextUtils.isEmpty(mProfileUpdateStationInput.getText())) {
            mProfileUpdateStationInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdatePhoneInput.getText())) {
            mProfileUpdatePhoneInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateJapanRelationInput.getText())) {
            mProfileUpdateJapanRelationInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateJapanEmergencyNameInput.getText())) {
            mProfileUpdateJapanEmergencyNameInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateJapanEmergencyPhoneInput.getText())) {
            mProfileUpdateJapanEmergencyPhoneInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (TextUtils.isEmpty(mProfileUpdateChinaRelationInput.getText())) {
            mProfileUpdateChinaRelationInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }
        if (TextUtils.isEmpty(mProfileUpdateChinaEmergencyNameInput.getText())) {
            mProfileUpdateChinaEmergencyNameInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }
        if (TextUtils.isEmpty(mProfileUpdateChinaEmergencyPhoneInput.getText())) {
            mProfileUpdateChinaEmergencyPhoneInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }
        if (TextUtils.isEmpty(mProfileUpdateResidenceCardInput.getText())) {
            mProfileUpdateResidenceCardInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }
        if (TextUtils.isEmpty(mProfileUpdatePassportInput.getText())) {
            mProfileUpdatePassportInput.setBackgroundResource(R.color.profileUpdateItemErrorBackground);
            mErrorCheckCount++;
        }

        if (mErrorCheckCount > 0) {
            Toast.makeText(getActivity(), mErrorCheckCount + " 個の項目が未入力です。", Toast.LENGTH_SHORT).show();
            return false;
        }


        return true;
    }

    /**
     * 入力項目状態リセット.
     */
    private void inputItemReset() {
        String methodName = "inputItemReset";
        Log.d("tei",CLASS_NAME + " " + methodName);
        mErrorCheckCount = 0;
        mProfileUpdateMailAddressInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateBirthdayInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateSignInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdatePostalCodeInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateStreetAddressInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateStationInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdatePhoneInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateJapanRelationInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateJapanEmergencyNameInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateJapanEmergencyPhoneInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateChinaRelationInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateChinaEmergencyNameInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateChinaEmergencyPhoneInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdateResidenceCardInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        mProfileUpdatePassportInput.setBackgroundResource(R.color.profileUpdateItemInitBackground);
        Log.d("tei","mErrorCheckCount " + mErrorCheckCount);
    }




}
