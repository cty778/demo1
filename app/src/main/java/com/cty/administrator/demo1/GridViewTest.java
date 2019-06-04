package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridViewTest extends AppCompatActivity {
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_test);
        gridView = findViewById(R.id.gridView);
        //1.准备数据源
        //2.新建适配器
    }
}
