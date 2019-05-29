package com.hkchakladar.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomLVAdapter extends BaseAdapter {

    //ArrayList<Movies> mItemList;

    ArrayList<Movies> itemList;

    public Activity context;
    public LayoutInflater inflater;

    public CustomLVAdapter(Activity context, ArrayList<Movies> itemList) {
        super();

        this.context = context;
        this.itemList = itemList;

        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Movies getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolder {
        ImageView poster;
        TextView title;
        TextView rating;
        TextView released;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Movies mv = itemList.get(position);

        ViewHolder holder;

        if(convertView==null) {

            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.row_movies, parent, false);

            holder.poster = convertView.findViewById(R.id.poster);
            holder.title = convertView.findViewById(R.id.title);
            holder.rating = convertView.findViewById(R.id.rating);
            holder.released = convertView.findViewById(R.id.released);

            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String rating_txt = "Rating: " + mv.getRating() + "/10";

        holder.poster.setImageResource(mv.getPoster());
        holder.title.setText(mv.getTitle());
        holder.rating.setText(rating_txt);
        holder.released.setText(mv.getReleased());

        return convertView;
    }
}
