package com.hong.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

public class bActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        StatusBarUtil.setColor(this,ContextCompat.getColor(this,R.color.orange));
    }


}
