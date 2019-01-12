package com.example.govlan.demoapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.govlan.demoapp.custom.BottomBar;
import com.example.govlan.demoapp.fragment.HomeFragment;
import com.example.govlan.demoapp.fragment.MineFragment;
import com.example.govlan.demoapp.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public int[]  b = {6,0,8,2,1,5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        maxWidthRamp(b);
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
    public int maxWidthRamp(int[] A) {
//        List<Integer> c = new ArrayList<>();
//        int len = A.length-1;
//        int len2 = A.length;
//        for (int i = 0; i < len; i++) {
//            for (int j = i+1; j < len2; j++) {
//                if (A[i] <= A[j]) {
//                   c.add(j-i);
//                } else  {
//
//                }
//            }
//        }
//        if (c.size()>0){
//           return Collections.max(c);
//        }else {
//            return 0;
//        }
        int n = A.length;
        int i = 0;
        int ans = 0;
        while (n - 1 - i > ans) {
            for (int j = n - 1; j > i; j--) {
                Log.i("先熟悉熟悉", "maxWidthRamp: "+i +"---------"+j);
                if (A[i] <= A[j]) {
                    ans = Math.max(ans, j - i);
                    break;
                }
            }
            i++;
        }
        Log.i("TAG", "maxWidthRamp: "+ans);
        return ans;
    }

}
