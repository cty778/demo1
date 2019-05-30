package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class TotleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ToggleButton tb ;
    private android.widget.ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totle_button);
        tb = findViewById(R.id.toggleButton);
        img = findViewById(R.id.imageView4);
        tb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        tb.setChecked(isChecked);
        Log.i("tag",isChecked?"真":"假");
        img.setBackgroundResource(isChecked?R.drawable.a1:R.drawable.a2);
    }
}
