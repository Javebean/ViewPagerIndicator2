package com.example.jake.viewpagerindicator2;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.GridView;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

import MyGridLayout.MyAdapter;

//import android.support.v4.view.ViewPager;

public class SampleCirclesDefault extends FragmentActivity {

    TestImageFragmentAdapter mAdapter;

    //detail https://github.com/Trinea/android-auto-scroll-view-pager
    AutoScrollViewPager mPager;
    PageIndicator mIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_circles);

        mAdapter = new TestImageFragmentAdapter(getSupportFragmentManager());

        mPager = (AutoScrollViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        mPager.startAutoScroll();//启动自动滚动

        mPager.setInterval(2000);// 设置自动滚动的间隔时间，单位为毫秒
        //mPager.setDirection(0);// 设置自动滚动的方向，默认向右
        //mPager.setCycle(true);// 是否自动循环轮播，默认为true
        //mPager.setScrollDurationFactor(double);// 设置ViewPager滑动动画间隔时间的倍率，达到减慢动画或改变动画速度的效果
        //mPager.setStopScrollWhenTouch(boolean);// 当手指碰到ViewPager时是否停止自动滚动，默认为true
        //mPager.setSlideBorderMode(int);// 滑动到第一个或最后一个Item的处理方式，支持没有任何操作、轮播以及传递到父View三种模式
        //mPager.setBorderAnimation(boolean);// 设置循环滚动时滑动到从边缘滚动到下一个是否需要动画，默认为true


        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);


        GridView gridView = (GridView) findViewById(R.id.type_nav);
        gridView.setAdapter(new MyAdapter(this));

    }
}