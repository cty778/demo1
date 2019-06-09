package com.cty.administrator.demo1;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FragmentTest extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);
        initViews();
        eventsViews();
    }
    private void eventsViews() {
        radioGroup.setOnCheckedChangeListener(this);
    }

    private void initViews() {
        radioGroup = (RadioGroup) findViewById(R.id.id_radioGroup);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.id_one:
                Intent it = new Intent(this, FragmentTest2.class);
                startActivity(it);
                break;
            case R.id.id_two:
                MyFragment2 myFragment2 = new MyFragment2();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction beginTransaction =   fragmentManager.beginTransaction();
                beginTransaction.add(R.id.id_frame, myFragment2);
                beginTransaction.addToBackStack(null);
                beginTransaction.commit();
                break;

            case R.id.id_three:
                Intent intent1=new Intent();
                intent1.setClass(FragmentTest.this, FragmentTest3.class);
                startActivity(intent1);
                break;

            case R.id.id_four:
                Toast.makeText(this, "four", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
