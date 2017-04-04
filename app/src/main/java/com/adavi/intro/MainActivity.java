package com.adavi.intro;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewpager;
    private int[] layouts;
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

        layouts= new int[]{R.layout.activity_screen1,R.layout.activity_screen2,R.layout.activity_screen3};
    }

    public class ViewPageAdapter extends PagerAdapter
    {
        private LayoutInflater lif;

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            lif=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v=LayoutInflater.inflate();
            return super.instantiateItem(container, position);
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }
    }
}
