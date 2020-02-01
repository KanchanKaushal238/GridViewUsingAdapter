package com.kanchan.gridview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] img;
    LayoutInflater inflator;

    public CustomAdapter(Context applicationContext, int[] img)
    {
        this.context = applicationContext;
        this.img = img;
        inflator = (LayoutInflater.from(applicationContext));
    }

public int getCount()
{
    return img.length;
}

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflator.inflate(R.layout.gridview, null);
        ImageView icon = convertView.findViewById(R.id.imageView);
        icon.setImageResource(img[position]);
        return convertView;
    }
}
