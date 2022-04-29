package com.example.gallery2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class nationAdapter extends BaseAdapter {
    int nation[];
    Context myContext;
    LayoutInflater myInfalter;
    public nationAdapter(Context MyContext,int Nation[]){
        this.nation=Nation;
        this.myContext=MyContext;
        myInfalter=(LayoutInflater.from(MyContext));

    }
    @Override
    public int getCount() {
        return nation.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= myInfalter.inflate(R.layout.layout_source,null);
        ImageView myImgsrc= view.findViewById(R.id.imgsrc);
        myImgsrc.setImageResource(nation[i]);
        return view;
    }
}
