package com.nalazoocare.viewpagertapswipet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.nalazoocare.viewpagertapswipet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        mTabLayout = findViewById(R.id.layout_tab);
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.kk));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.kk));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.kk));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mViewPager = findViewById(R.id.pager);
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pagerAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
//       Toolbar toolbar = findViewById(R.id.toolbar);
//       Toolbar toolbar = findViewById(R.id.toolbar);
//            toolbar.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Snackbar.make(v,"Replace with your own action", Snackbar.LENGTH_SHORT).setAction("Action",null).show();
//
//                }
//            });
    }


}
