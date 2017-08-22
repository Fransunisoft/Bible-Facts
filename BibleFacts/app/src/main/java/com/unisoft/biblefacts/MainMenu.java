package com.unisoft.biblefacts;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.unisoft.biblefacts.MainMenu;


public class MainMenu extends Activity {
    Button viewfacts;
    Button learnmore;
    Button miracles;
    Button parables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_menu);

        viewfacts = (Button) findViewById(R.id.viewbtn);
        learnmore = (Button) findViewById(R.id.learnbtn);
        miracles = (Button) findViewById(R.id.miraclesbtn);
        parables = (Button) findViewById(R.id.parablesbtn);

        viewfacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, com.unisoft.biblefacts.ViewFacts.class);
                startActivity(i);
            }
        });

        miracles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, com.unisoft.biblefacts.MiraclesOfJesus.class);
                startActivity(i);
            }
        });

        parables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, com.unisoft.biblefacts.ParablesOfJesus.class);
                startActivity(i);
            }
        });
        learnmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainMenu.this, com.unisoft.biblefacts.LearnMore.class);
                startActivity(i);
            }
        });

    }

    public void open(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Exit?");
        builder.setMessage("Are you sure you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void open1(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("About");
        builder.setMessage("Bible Discovery was researched and put together by an Ado-ekiti(Southwest, Nigeria)-based ICT-Enthusiast). Contact:dbigbros2011@yahoo.com");
        builder.setCancelable(true);
        builder.setIcon(R.drawable.helpout);
        builder.setNeutralButton(android.R.string.ok,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //if user select "ok", just cancel this dialog and continue with app
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


}
