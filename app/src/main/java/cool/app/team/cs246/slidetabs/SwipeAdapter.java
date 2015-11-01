package cool.app.team.cs246.slidetabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Reed on 11/1/2015.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter{

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = new PageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("countKey", i + 1);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
