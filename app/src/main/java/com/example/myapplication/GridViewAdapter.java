package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 华硕 on 2016/1/18.
 */
public class GridViewAdapter extends BaseAdapter {

    private List<Integer> list;
    private Context context;

    public GridViewAdapter(List<Integer> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.item,null);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBox);
        checkBox.setBackgroundResource(list.get(i));
        return view;
    }
}
