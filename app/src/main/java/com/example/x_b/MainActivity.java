package com.example.x_b;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.toobar)
    Toolbar toobar;
    @BindView(R.id.fl)
    FrameLayout fl;
    @BindView(R.id.tab)
    TabLayout tab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toobar.setTitle("");
        tvTitle.setText("新闻");
        setSupportActionBar(toobar);
        AFragment aFragment = new AFragment();
        BFragment bFragment = new BFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fl,aFragment).add(R.id.fl,bFragment).hide(bFragment).commit();
        tab.addTab(tab.newTab().setText("首页"));
        tab.addTab(tab.newTab().setText("收藏"));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        fm.beginTransaction().show(aFragment).hide(bFragment).commit();
                        break;
                    case 1:
                        fm.beginTransaction().show(bFragment).hide(aFragment).commit();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
