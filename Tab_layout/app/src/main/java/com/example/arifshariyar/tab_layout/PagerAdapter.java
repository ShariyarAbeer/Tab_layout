package com.example.arifshariyar.tab_layout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arif Shariyar on 2/21/2018.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    int mONofTabs;

    public PagerAdapter(FragmentManager fm,int NumberOfTabs)
    {
        super(fm);
        this.mONofTabs=NumberOfTabs;

    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Tab_1 tab_1 = new Tab_1();
                return tab_1;

            case 1:
                Tab_2 tab_2 = new Tab_2();
                return tab_2;

            case 2:
                Tab_3 tab_3 = new Tab_3();
                return tab_3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mONofTabs;
    }
}
