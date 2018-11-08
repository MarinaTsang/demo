package com.example.zeng.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyRecycleAdapter<T> extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {

    private static final String TAG = "MyRecycleAdapter";

    private Context mContext;
    private List<T> datas;  //可换成泛型

    public MyRecycleAdapter(Context mContext, List<T> datas) {
        this.mContext = mContext;
        this.datas = datas;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.item) TextView itemTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){

        View inflate = LayoutInflater.from(mContext).inflate(R.layout.ada_item, viewGroup, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: "+i);
//        myViewHolder = new MyViewHolder()
        myViewHolder.itemTv.setText((CharSequence) datas.get(i));
        //设置点击事件---或者使用自定义接口实现
        myViewHolder.itemTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "recyvcle点击了: "+i,Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return datas==null ? 0:datas.size();
    }
}
