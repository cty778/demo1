package com.cty.administrator.demo1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
    private AutoCompleteTextView acTextView;
    private String[] res= {"beijing1","beijing2","beijing3","beijing4","wocao1","wocao2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        /*
        第一步：初始化控件
        第二步：需要一个适配器
        第三步：初始化数据源---这数据源去匹配文本输入的内容
        第四步：将adapter与当前控件autocompletetextview绑定
         */
        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, res);
        acTextView.setAdapter(adapter);
    }
}
