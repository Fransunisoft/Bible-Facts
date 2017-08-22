package com.unisoft.biblefacts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ViewFacts extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_view_facts);




    GridView gridview = (GridView) findViewById(R.id.gridview);
    gridview.setAdapter(new com.unisoft.biblefacts.ImageAdapter(this));

    gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View v,
        int position, long id) {

            // Send intent to SingleViewActivity
            Intent i =
                    new Intent(getApplicationContext(), SingleViewActivity.class);
            // Pass image index
            i.putExtra("id", position);
            startActivity(i);
        }
    });
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_view_facts, menu);
        return true;
    }
}

