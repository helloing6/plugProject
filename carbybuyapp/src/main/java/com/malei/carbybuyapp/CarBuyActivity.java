package com.malei.carbybuyapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.malei.baseutilslib.ToastUtils;

/**
 * @author by malei on 2018/3/8.
 */
@Route(path = "/com/main")
public class CarBuyActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carbuy);

        ToastUtils.show(this,"开始了");

    }
}
