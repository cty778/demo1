package com.cty.administrator.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class ProgressBarTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //启用窗口特征，启用不带进度条和带进度条的。
        requestWindowFeature(Window.FEATURE_PROGRESS);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_progress_bar_test);
        //显示两种进度条
        setProgressBarVisibility(true);
        setProgressBarIndeterminateVisibility(false);
        setProgress(9999);

    }
}
