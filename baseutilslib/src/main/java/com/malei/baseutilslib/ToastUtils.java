package com.malei.baseutilslib;

import android.content.Context;
import android.widget.Toast;

/**
 * @author by malei on 2018/3/8.
 */

public class ToastUtils {

    public static void show(Context context, String res){
        Toast.makeText(context,res,Toast.LENGTH_SHORT).show();
    }
}
