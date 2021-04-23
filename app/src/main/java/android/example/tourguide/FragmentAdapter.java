package android.example.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    Context mcontext;

    public FragmentAdapter(Context context, FragmentManager fm){
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HotelsFragment();
        }else if(position == 1){
            return  new RestaurantsFragment();
        }else if(position == 2){
            return  new CafeFragment();
        }else {
            return new NightLifeFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return mcontext.getString(R.string.hotels);
        }else if(position == 1){
            return  mcontext.getString(R.string.restaurants);
        }else if(position == 2){
            return  mcontext.getString(R.string.cafe);
        }else {
            return mcontext.getString(R.string.nightlife);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
