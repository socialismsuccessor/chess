package com.example.mac.chess.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setContentView());
        // 初始化View注入
        ButterKnife.bind(this);
        initView();
        initListener();
        initDate();
    }

    protected abstract int setContentView();

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract void initDate();

}
