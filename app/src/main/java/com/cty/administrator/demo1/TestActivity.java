package com.cty.administrator.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {
    private String tag =  "tag";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag,"执行onCreate方法");
        setContentView(R.layout.activity_test);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TestActivity.this,SecondeTextActivity.class);
                TestActivity.this.startActivity(intent);

//                intent = new Intent(MainActivity.this,SecondeTextActivity.class);
//                MainActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(tag,"执行onStart方法");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag,"执行onResume方法");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag,"执行onPause方法");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(tag,"执行onStop方法");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag,"执行onDestroy方法");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag,"执行onRestart方法");
    }

}
