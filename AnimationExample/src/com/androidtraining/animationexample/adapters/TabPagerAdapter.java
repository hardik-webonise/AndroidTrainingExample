package com.androidtraining.animationexample.adapters;

import com.androidtraining.animationexample.AlbumFragment;
import com.androidtraining.animationexample.ArtistFragment;
import com.androidtraining.animationexample.SongsFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

	public TabPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new AlbumFragment();
		case 1:
			// Games fragment activity
			return new ArtistFragment();
		case 2:
			// Movies fragment activity
			return new SongsFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
