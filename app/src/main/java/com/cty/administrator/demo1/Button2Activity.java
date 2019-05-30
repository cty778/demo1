package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Button2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button2.setOnClickListener(listener);
        /*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
    }
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("tag","独立类实现事件监听");
            }

        };

    @Override
    public void onClick(View v) {
        Log.i("tag","第三种事件监听的方法");
    }
}