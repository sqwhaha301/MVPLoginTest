package com.ceo.mvplogintest.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ceo.mvplogintest.R;
import com.ceo.mvplogintest.bean.User;
import com.ceo.mvplogintest.persenter.UserLoginPresenter;

public class MainActivity extends AppCompatActivity implements IUserLoginView{



    private EditText mEtUserName;
    private EditText mEtPassWord;
    private Button mBtnClear;
    private Button mBtnLogin;
    private ProgressBar mPbLogin;
private final String TAG= "MAIN";
    private UserLoginPresenter mUserLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        initView();
    


    }

    private void initView() {
        mEtUserName = (EditText) findViewById(R.id.username_et);
        mEtPassWord = (EditText) findViewById(R.id.passwrod_et);
        mBtnClear = (Button) findViewById(R.id.btn_clear);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mPbLogin = (ProgressBar) findViewById(R.id.pb);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUserLoginPresenter.login();
            }
        });
        mBtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUserLoginPresenter.clear();
            }
        });



    }

    @Override
    public String getUserName() {
        return mEtUserName.getText().toString().trim();
    }

    @Override
    public String getPassWord() {
        return mEtPassWord.getText().toString().trim();
    }

    @Override
    public void clearUserName() {
        mEtUserName.setText("");
    }

    @Override
    public void clearPassWord() {
        mEtPassWord.setText("");
    }

    @Override
    public void showLoading() {
            mPbLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
            mPbLogin.setVisibility(View.GONE);
    }

    @Override
    public void toMainActivity(User user) {
        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this ,"  login Failed", Toast.LENGTH_SHORT).show();
    }

    public MainActivity() {
        super();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
                
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: ");
        super.onRestart();
    }
}
