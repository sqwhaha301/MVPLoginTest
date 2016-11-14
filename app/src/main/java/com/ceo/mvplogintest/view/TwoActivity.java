package com.ceo.mvplogintest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.ceo.mvplogintest.R;

public class TwoActivity extends AppCompatActivity {

    private TextView mTv;
    private final  String  TAG ="TWO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d(TAG, "onCreate: ");
        mTv = (TextView)findViewById(R.id.tv);



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
