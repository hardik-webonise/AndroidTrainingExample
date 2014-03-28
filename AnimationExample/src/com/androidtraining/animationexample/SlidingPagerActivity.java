package com.androidtraining.animationexample;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.androidtraining.animationexample.adapters.TabPagerAdapter;

public class SlidingPagerActivity extends FragmentActivity implements
		TabListener {
	private ViewPager pager;
	private ActionBar actionBar;
	private TabPagerAdapter tabAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sliding_pager_activity);
		pager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		tabAdapter = new TabPagerAdapter(getSupportFragmentManager());

		pager.setAdapter(tabAdapter);

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});

		// Adding Tabs
		actionBar.addTab(actionBar.newTab()
				.setText(getString(R.string.by_albums)).setTabListener(this));
		actionBar.addTab(actionBar.newTab()
				.setText(getString(R.string.by_artists)).setTabListener(this));
		actionBar.addTab(actionBar.newTab()
				.setText(getString(R.string.by_songs)).setTabListener(this));
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		pager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}
}
