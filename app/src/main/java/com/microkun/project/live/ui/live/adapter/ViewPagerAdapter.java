package com.microkun.project.live.ui.live.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.microkun.project.live.ui.live.fragment.LiveFragment;

/**
 * @introduction：
 * @author： 林锦焜
 * @time： 2022/9/1 20:13
 */
public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return LiveFragment.newInstance();
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

}
