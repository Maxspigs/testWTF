package com.quoizz.max.testwtf;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ImageAdapter extends FragmentPagerAdapter {
    private List<ImageFragment> imagesFragment;

    public ImageAdapter(FragmentManager fm, List<ImageFragment> imagesFragment) {
        super(fm);
        this.imagesFragment = imagesFragment;
    }

    @Override
    public Fragment getItem(int i) {
        return imagesFragment.get(i);
    }

    @Override
    public int getCount() {
        return imagesFragment.size();
    }
}
