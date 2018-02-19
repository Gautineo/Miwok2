package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentPageAdapter extends FragmentPagerAdapter {


    public FragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0){
            return new NumberFragment();
        }
        else if(position == 1){
            return new FamilyFragment();
        }
        else if(position == 3){
            return new ColorsFragment();
        }
        else
            return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0: return "Numbers";

            case 1: return "Family";

            case 2: return "Colors";

            case 3: return "phrases";

        }
        return super.getPageTitle(position);
    }
}
