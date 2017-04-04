package com.adavi.intro;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;

    private intro one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        one = new intro(this);
        if(!one.Check())
        {
            one.setFirst(false);
            Intent i = new Intent(MainActivity.this,main2.class);
            startActivity(i);
            finish();
        }
        setContentView(R.layout.activity_main);
    }

    public class ViewPageAdapter extends PagerAdapter
    {
        private LayoutInflater lif;

    }
}
