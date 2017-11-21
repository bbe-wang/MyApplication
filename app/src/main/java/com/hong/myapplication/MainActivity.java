package com.hong.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent Intent=new Intent(this,aActivity.class);
                startActivity(Intent);
              break;
            case R.id.btn2:
                Intent Intent2=new Intent(this,bActivity.class);
                startActivity(Intent2);
                break;
        }

    }
}
