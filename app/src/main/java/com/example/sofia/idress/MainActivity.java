package com.example.sofia.idress;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost mTabHost;
    ListView mListaMaglie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListaMaglie=(ListView)findViewById(R.id.ListMaglie) ;
        mTabHost=(TabHost)findViewById(R.id.ScrollTab);
        mTabHost.setup();

        TabHost.TabSpec spec = mTabHost.newTabSpec("Maglia");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Maglia");
        mTabHost.addTab(spec);

        spec = mTabHost.newTabSpec("Pantalone");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Pantalone");
        mTabHost.addTab(spec);

        spec = mTabHost.newTabSpec("Scarpe");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Scarpe");
        mTabHost.addTab(spec);

        mListaMaglie.setBackgroundColor(Color.WHITE);

        /*mTabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTabHost.getTabWidget().getChildAt(mTabHost.get).setBackgroundColor(Color.parseColor("#6397D0"));}

        });

        for(int i =0; i<3; i++){
        mTabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#6397D0"));}*/



        }
    }



