package com.unisoft.biblefacts;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleViewActivity extends Activity {
    public ViewPager pager;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_single_view);

        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");

        pager = (ViewPager) findViewById(R.id.SingleView);
        FullScreenImageAdapter adapter = new FullScreenImageAdapter
                (this, mThumbIds);
        pager.setAdapter(adapter);
        pager.setCurrentItem(position);

//        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
//        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
}
