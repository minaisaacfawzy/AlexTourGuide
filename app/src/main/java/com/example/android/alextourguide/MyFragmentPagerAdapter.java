package com.example.android.alextourguide;

import android.content.Context;
import android.net.ConnectivityManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by M on 06/06/2018.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    Context mContext;
    public MyFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new AttractionFragment();
        else if(position == 1)
            return new RestaurantsFragment();
        else if(position == 2)
            return new MuseumsFragment();
        else if(position == 3)
            return new MovieTheatreFragment();
        else
            return new BeachesFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.Attraction_Fragment_Title);
        else if(position == 1)
            return mContext.getString(R.string.Restaurants_Fragment_Title);
        else if(position == 2)
            return mContext.getString(R.string.Museums_Fragment_Title);
        else if (position == 3)
            return mContext.getString(R.string.MovieTheatres_Fragment_Title);
        else
            return mContext.getString(R.string.Beaches_Fragment_Title);
    }
}
