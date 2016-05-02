package com.example.jake.viewpagerindicator2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TestImageFragmentAdapter extends FragmentPagerAdapter {
    protected static final int[] CONTENT = new int[] { R.drawable.lunbo, R.drawable.lunbo, R.drawable.lunbo, R.drawable.lunbo };


    private int mCount = CONTENT.length;

    public TestImageFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TestImageFragment.newInstance(CONTENT[position % CONTENT.length]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return "";
    }


}