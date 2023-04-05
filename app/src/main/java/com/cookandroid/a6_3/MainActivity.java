package com.cookandroid.a6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecDog=tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat=tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.tabCat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRab=tabHost.newTabSpec("RABBIT").setIndicator("토끼");
        tabSpecRab.setContent(R.id.tabRab);
        tabHost.addTab(tabSpecRab);

        TabHost.TabSpec tabSpecHorse=tabHost.newTabSpec("HORSE").setIndicator("말");
        tabSpecHorse.setContent(R.id.tabHor);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}