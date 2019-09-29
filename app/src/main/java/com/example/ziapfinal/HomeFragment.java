package com.example.ziapfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.ziapfinal.Adapter.SectionPagerAdapter;
import com.example.ziapfinal.FragmentList.eight_8;
import com.example.ziapfinal.FragmentList.eleven_11;
import com.example.ziapfinal.FragmentList.five_5;
import com.example.ziapfinal.FragmentList.four_4;
import com.example.ziapfinal.FragmentList.nine_9;
import com.example.ziapfinal.FragmentList.one_1;

import com.example.ziapfinal.FragmentList.seven_7;
import com.example.ziapfinal.FragmentList.six_6;
import com.example.ziapfinal.FragmentList.ten_10;
import com.example.ziapfinal.FragmentList.three_3;
import com.example.ziapfinal.FragmentList.twelve_12;
import com.example.ziapfinal.FragmentList.two_2;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    View myFragment;

    ViewPager viewPager;
    TabLayout tabLayout;

    public HomeFragment() {
    }

    public static HomeFragment getInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);

        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new one_1(),"잠 부족");
        adapter.addFragment(new two_2(), "허리 아픔");
        adapter.addFragment(new three_3(),"스트레스");
        adapter.addFragment(new four_4(),"두통");
        adapter.addFragment(new five_5(),"어깨아픔");
        adapter.addFragment(new six_6(),"식욕억제");
        adapter.addFragment(new seven_7(),"만성피로");
        adapter.addFragment(new eight_8(),"눈이 침침");
        adapter.addFragment(new nine_9(),"소화불량");
        adapter.addFragment(new ten_10(),"생리통");
        adapter.addFragment(new eleven_11(),"변비");
        adapter.addFragment(new twelve_12(),"멀미");

        viewPager.setAdapter(adapter);

    }

}
