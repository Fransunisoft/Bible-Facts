package com.unisoft.biblefacts;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.unisoft.biblefacts.ImageAdapter;

/**
 * Created by francis on 10/16/2015.
 */


public class ImageAdapter extends BaseAdapter {

    public ImageAdapter() {

    }

    public Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(125, 125));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6,
            R.drawable.image7, R.drawable.image8,
            R.drawable.image9, R.drawable.image10,
            R.drawable.image11, R.drawable.image12,
            R.drawable.image13, R.drawable.image14,
            R.drawable.image15, R.drawable.image16,
            R.drawable.image17, R.drawable.image18,
            R.drawable.image19, R.drawable.image20,
            R.drawable.image21, R.drawable.image22,
            R.drawable.image23, R.drawable.image24,
            R.drawable.image25, R.drawable.image26,
            R.drawable.image27, R.drawable.image28,
            R.drawable.image29, R.drawable.image30,
            R.drawable.image31, R.drawable.image32,
            R.drawable.image33
    };
}