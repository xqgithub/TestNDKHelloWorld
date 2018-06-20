package com.first.testndkhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main = findViewById(R.id.tv_main);
        HelloJni helloJni = new HelloJni();
        tv_main.setText("sayHello得到的数字===" + helloJni.sayHello(10));
    }
}
