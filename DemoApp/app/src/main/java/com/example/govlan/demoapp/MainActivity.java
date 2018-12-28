package com.example.govlan.demoapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.govlan.demoapp.custom.BottomBar;
import com.example.govlan.demoapp.fragment.HomeFragment;
import com.example.govlan.demoapp.fragment.MineFragment;
import com.example.govlan.demoapp.fragment.NewsFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#03A9F5")
                .addItem(HomeFragment.class,
                        "首页",
                        R.mipmap.tab_ico_mine_normal,
                        R.mipmap.tab_ico_mine_selected
                )
                .addItem(NewsFragment.class,
                        "新闻",
                        R.mipmap.tab_ico_charge_normal,
                        R.mipmap.tab_ico_charge_selected)
                .addItem(MineFragment.class,
                        "我的",
                        R.mipmap.cdz_ico_star_gray,
                        R.mipmap.cdz_ico_collect_actived)
                .build();

    }

}
