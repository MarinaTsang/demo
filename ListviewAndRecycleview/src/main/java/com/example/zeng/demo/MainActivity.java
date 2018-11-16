package com.example.zeng.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.lv)
    ListView lv;
    @BindView(R.id.rv)
    RecyclerView rv;

    private Unbinder bind;

    private List<String> listViewDatas;
    private List<String> recycleViewDatas;

    new HashMap
    new Hashtable
    new HashSet

    private AppCompatActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        bind = ButterKnife.bind(this);

        if (listViewDatas == null){
            listViewDatas = new ArrayList<>();
        }
        if (recycleViewDatas == null){
            recycleViewDatas = new ArrayList<>();
        }
        //构建数据
        for (int i = 0; i < 20; i++) {
            listViewDatas.add("listview:"+i);
            recycleViewDatas.add("recycleview:"+i);
        }

        MyListAdapter<String> adapter = new MyListAdapter<>(mActivity,listViewDatas);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: "+position);
                Toast.makeText(mActivity,"listview点击了："+position,Toast.LENGTH_LONG).show();
            }
        });

        //recycleview
        LinearLayoutManager manager = new LinearLayoutManager(mActivity);  //可以修改为网格布局 瀑布流布局
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.addItemDecoration(new DividerItemDecoration(mActivity,LinearLayoutManager.VERTICAL));
        rv.setLayoutManager(manager);

        MyRecycleAdapter myRecycleAdapter = new MyRecycleAdapter(mActivity,recycleViewDatas);
        rv.setAdapter(myRecycleAdapter);


    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind != null) {
            bind.unbind();
        }
    }
}
