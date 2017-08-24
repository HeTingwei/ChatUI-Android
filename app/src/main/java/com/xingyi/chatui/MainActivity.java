package com.xingyi.chatui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;
    final  static int LEFT=1;
    final  static int RIGHT=2;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        recyclerView= (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter=new ItemAdapter(this);
        recyclerView.setAdapter(itemAdapter);
    }

    public void leftClick(View v){
        //第一个参数指定发出内容，第二参数指定发出的是左还是右
        itemAdapter.addItem("左边发出:\n右边你好"+i,LEFT);
        recyclerView.smoothScrollToPosition(i);//移动到指定位置
        i++;
    }

    public void rightClick(View v){
        //第一个参数指定发出内容，第二参数指定发出的是左还是右
        itemAdapter.addItem("右边发出:\n左边你好"+i,RIGHT);
        recyclerView.smoothScrollToPosition(i);//移动到指定位置
        i++;
    }


}
