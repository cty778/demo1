package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ListViewTest extends AppCompatActivity implements AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private ListView listView;
    private ArrayAdapter<String> arr_adapter ;
    private SimpleAdapter simp_adapter;
    private List<Map<String,Object>> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);
        listView = findViewById(R.id.listView);
        //1.新建一个数据适配器
        //ArrayAdapter(上下文,当前ListView加载的每一个列表项所对应的布局文件, 数据源)
        //2.适配器加载数据源
        String[]arr_data = {"我去你吗了个得儿","qnmlgb","去年买了个表","去年买了个表哥","去年买了个表爹"};
        arr_adapter=  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr_data);
        dataList = new ArrayList<Map<String,Object>>();
        simp_adapter = new SimpleAdapter(this,getData(),R.layout.layout,new String[]{"pic","text"},new int[]{R.id.pic,R.id.text});
        //3.视图(ListView)加载适配器
        //listView.setAdapter(arr_adapter);
        listView.setAdapter(simp_adapter);
        listView.setOnItemClickListener(this);
        listView.setOnScrollListener(this);
        /*  simpleAdapter 参数
            context
            data:数据源 (List<? extends Map<String,?>> data) map所组成的 List集合
                每一个map都会对应ListView列表中的一行
                每一个map（键值对）中的键必须包含所有在from中所指定的键
           resource：列表项的布局文件ID
           from: Map中的键名
           to:绑定数据视图中的ID,与from对应
         */


    }
    private List<Map<String,Object>> getData(){
        for(int i= 0;i<20;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("pic",R.drawable.android_icon);
            map.put("text","我尼玛"+i);
            dataList.add(map);

        }
        return dataList;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        switch(scrollState){
            case SCROLL_STATE_FLING:
                Log.i("tag","用户在手指离开屏幕前，由于用力滑了一下，视图依靠观星继续滑动");
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("pic",R.drawable.android_icon);
                map.put("text","增加项");
                dataList.add(map);
                simp_adapter.notifyDataSetChanged();
                break;
            case SCROLL_STATE_IDLE:
                Log.i("tag","视图已经停止滑动");
                break;
            case SCROLL_STATE_TOUCH_SCROLL:
                Log.i("tag","手指没有离开屏幕，视图正在滑动");
                break;

        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = listView.getItemAtPosition(position)+"";
        Toast.makeText(this,"position:"+position+"string:"+text, Toast.LENGTH_LONG).show();
    }
}
