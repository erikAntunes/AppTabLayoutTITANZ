package com.titanz.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.titanz.myapplication.R;
import com.titanz.myapplication.adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout_main_id);
        appBarLayout = findViewById(R.id.appbar_main_id);
        viewPager = findViewById(R.id.viewpager_main_id);


        //Adicionando Fragments

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentFirst(),"First" );
        adapter.AddFragment(new FragmentSecond(),"Second" );
        adapter.AddFragment(new FragmentThird(),"Third" );

        // Adapter Setup

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
