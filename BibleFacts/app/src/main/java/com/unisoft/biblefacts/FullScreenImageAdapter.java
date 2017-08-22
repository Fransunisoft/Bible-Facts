package com.unisoft.biblefacts;

/**
 * Created by francis on 10/16/2015.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;



public class FullScreenImageAdapter extends PagerAdapter {

    private Context _activity;
    private Integer[] _imagePaths;
    private LayoutInflater inflater;

    // constructor
    public FullScreenImageAdapter(Context context,
                                  Integer[] imagePaths) {
        this._activity = context;
        this._imagePaths = imagePaths;
    }

    @Override
    public int getCount() {
        return this._imagePaths.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imgDisplay;

        inflater = (LayoutInflater) _activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewLayout = inflater.inflate(R.layout.layout_fullscreen_image, container,
                false);

        imgDisplay = (ImageView) viewLayout.findViewById(R.id.imgDisplay);
        imgDisplay.setImageResource(_imagePaths[position]);
//        Picasso.with(_activity)
//                .load("http://propertyhub.com.ng/smartpro/uploads/photos/" + _imagePaths[position])
//                .placeholder(R.drawable.loadinganimation)
//                .error(R.drawable.home_stays)
//                .into(imgDisplay);

        ((ViewPager) container).addView(viewLayout);

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}