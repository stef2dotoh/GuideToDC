package com.example.android.guidetodc;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that supports swiping for
 * each fragment.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of app
     */
    private Context mContext;

    /**
     * Constructor
     * @param context is context of app
     * @param fm is fragment manager that will keep each fragment's state in the adapter
     *           across swipes
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return {@link Fragment} that should be displayed for the given page number.
     * @param position is the page number
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new SeeFragment();
        else if (position == 1)
            return new ShopFragment();
        else if (position == 2)
            return new EatFragment();
        else
            return new StayFragment();
    }

    /**
     * Return total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Get category titles for each page
     * @param position is the page number
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString((R.string.category_see));
        else if (position == 1)
            return mContext.getString((R.string.category_shop));
        else if (position == 2)
            return mContext.getString((R.string.category_eat));
        else
            return mContext.getString((R.string.category_stay));
    }
}
