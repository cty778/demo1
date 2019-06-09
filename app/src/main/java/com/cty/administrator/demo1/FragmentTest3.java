package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FragmentTest3 extends AppCompatActivity {
    private boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        init();
        Button bt=(Button) findViewById(R.id.main3_bt);
        bt.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                if(flag){
                    MyFragment3 fragment=new MyFragment3();
                    beginTransaction.replace(R.id.main_layout, fragment);
                    flag=false;
                }
                else{
                    MyFragment4 fragment=new MyFragment4();
                    beginTransaction.replace(R.id.main_layout, fragment);
                    flag=true;

                }
                beginTransaction.commit();
            }
        });

    }

    private void init() {
        // TODO Auto-generated method stub
        MyFragment3 fragment=new MyFragment3();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add(R.id.main_layout, fragment);
        beginTransaction.commit();
    }

}
