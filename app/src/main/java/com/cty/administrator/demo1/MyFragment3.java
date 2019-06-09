package com.cty.administrator.demo1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment3 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
//      每次创建都会绘制Fragment的View组件回调
        View view = inflater.inflate(R.layout.fragment2,container, false);
        TextView tv=(TextView) view.findViewById(R.id.fg2_tv);
        tv.setText("第3个Fragment");
        Log.i("lpl", "Fragment1-onCreateView");
        return view;
    }
    //当Fragment被添加到Activity中的时候会回调这个方法，只调用一次。
    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
        Log.i("lpl", "Fragment1-onAttach");
    }
    //创建Fragment的时候会回调，该方法只回调一次
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        Log.i("lpl", "Fragment1-onCreate");

    }
    //  当Fragment所在的Activity启动后调用
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        Log.i("lpl", "Fragment1-onActivityCreated");

    }


    //  启动Fragment
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.i("lpl", "Fragment1-onStart");

    }
    //  恢复Fragment时会被回调，调用onstart方法后一定调用该方法
    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.i("lpl", "Fragment1-onResume");

    }

    //  暂停Fragment
    @Override
    public void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.i("lpl", "Fragment1-onPause");

    }

    //  停止Fragment
    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.i("lpl", "Fragment1-onStop");

    }

    //  销毁Fragment所包含的View组件是调用
    @Override
    public void onDestroyView() {
        // TODO Auto-generated method stub
        super.onDestroyView();
        Log.i("lpl", "Fragment1-onDestroyView");

    }

    //  销毁Fragment时会被回调
    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.i("lpl", "Fragment1-onDestroy");

    }

    //  Fragment从Activity删除时会回调该方法，该方法只会被调用一次
    @Override
    public void onDetach() {
        // TODO Auto-generated method stub
        super.onDetach();
        Log.i("lpl", "Fragment1-onDetach");

    }
}
