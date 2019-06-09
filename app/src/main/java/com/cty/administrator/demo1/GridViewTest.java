package com.cty.administrator.demo1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewTest extends Activity implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private List<Map<String,Object>> dataList;
    private int[]icon={R.drawable.app_icon_1,R.drawable.app_icon_2,R.drawable.app_icon_3,R.drawable.app_icon_4,R.drawable.app_icon_5,
            R.drawable.app_icon_6,R.drawable.app_icon_7,R.drawable.app_icon_8,R.drawable.app_icon_9,R.drawable.app_icon_10,
            R.drawable.app_icon_11,R.drawable.app_icon_12,R.drawable.app_icon_13,R.drawable.app_icon_14,R.drawable.app_icon_15,
            R.drawable.app_icon_16,R.drawable.app_icon_17,R.drawable.app_icon_18,R.drawable.app_icon_19,R.drawable.app_icon_20};
    private String[]iconName={"一","二","三","四","五","六","七","八","九","十","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_test);
        gridView = findViewById(R.id.gridView);
        //1.准备数据源
        //2.新建适配器
        //3.gridView加载适配器
        //4.gridView配置事件监听
        dataList = new ArrayList<Map<String,Object>>();
        simpleAdapter = new SimpleAdapter(this, getData(), R.layout.gridviewitem,  new String[]{"image","text"},  new int[]{R.id.image,R.id.text});
        gridView.setAdapter(simpleAdapter);
        gridView.setOnItemClickListener(this);
    }

    private List<Map<String,Object>> getData() {
        for(int i=0; i<icon.length;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("image",icon[i]);
            map.put("text",iconName[i]);
            dataList.add(map);
        }
        return dataList;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "我是"+iconName[position], Toast.LENGTH_LONG).show();
    }
}
