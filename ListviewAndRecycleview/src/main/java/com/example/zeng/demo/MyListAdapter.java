package com.example.zeng.demo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyListAdapter<T> extends BaseAdapter {

    private static final String TAG = "MyListAdapter";

    private Context mContext;
//    private int itemViewId;
    private List<T> datas;

    public MyListAdapter(Context mContext, /*int itemViewId,*/ List<T> datas) {
        this.mContext = mContext;
//        this.itemViewId = itemViewId;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, "getView: "+position);
        MyHolder holder;
        if (convertView==null){
            convertView = View.inflate(mContext,R.layout.ada_item,null);
            holder = new MyHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (MyHolder) convertView.getTag();
        }

        holder.itemTv.setText((CharSequence) datas.get(position));

        return convertView;
    }


    static class MyHolder {
        @BindView(R.id.item) TextView itemTv;

        public MyHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }

}

