package com.example.lab6fragments;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.lab6fragments.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        TabLayout tabLayout=findViewById(R.id.tab_layout);
        ViewPager2 viewPager= findViewById(R.id.view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {

            switch (position){
                case 0:
                    tab.setText("Home");
                    break;
                case 1:
                    tab.setText("AboutUs");
                    break;
                case 2:
                    tab.setText("Contact");
                    break;
                case 3:
                    tab.setText("Settings");
                    break;


            }

        }).attach();



    }
}