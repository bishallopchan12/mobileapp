package com.example.lab6fragments.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lab6fragments.AboutUsFragment;
import com.example.lab6fragments.ContactFragment;
import com.example.lab6fragments.HomeFragment;
import com.example.lab6fragments.SettingsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch(position) {
          case 0:
              return new HomeFragment();
          case 1:
              return new AboutUsFragment();
          case 2:
              return new ContactFragment();
          case 3:
              return new SettingsFragment();
          default:
              return new HomeFragment();
      }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
