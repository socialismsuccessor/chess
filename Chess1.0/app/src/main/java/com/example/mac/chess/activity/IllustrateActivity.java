package com.example.mac.chess.activity;


import android.view.WindowManager;

import com.example.mac.chess.activity.base.BaseActivity;
import com.hrf.chess.R;


public class IllustrateActivity extends BaseActivity {

    @Override
    protected int setContentView() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        return R.layout.activity_illustrate;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initListener() {

    }


    @Override
    protected void initDate() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
