package com.androidtraining.animationexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnFrameAnimation, btnFadeIn, btnFadeOut, btnCrossFade,
			btnSlidingPager, btnSlideUp, btnSlideDown;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		btnFrameAnimation = (Button) findViewById(R.id.btnFrameAnimation);
		btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
		btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
		btnCrossFade = (Button) findViewById(R.id.btnCrossFade);
		btnSlidingPager = (Button) findViewById(R.id.btnSlidingPager);
		btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
		btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
		btnFrameAnimation.setOnClickListener(this);
		btnFadeIn.setOnClickListener(this);
		btnFadeOut.setOnClickListener(this);
		btnCrossFade.setOnClickListener(this);
		btnSlidingPager.setOnClickListener(this);
		btnSlideUp.setOnClickListener(this);
		btnSlideDown.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int viewId = v.getId();
		if (viewId == R.id.btnFrameAnimation) {
			Intent intent = new Intent(context, FrameAnimationActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnFadeIn) {
			Intent intent = new Intent(context, FadeInActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnFadeOut) {
			Intent intent = new Intent(context, FadeOutActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnCrossFade) {
			Intent intent = new Intent(context, CrossfadeActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnSlidingPager) {
			Intent intent = new Intent(context, SlidingPagerActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnSlideUp) {
			Intent intent = new Intent(context, SlideUpActivity.class);
			startActivity(intent);
		} else if (viewId == R.id.btnSlideDown) {
			Intent intent = new Intent(context, SlideDownActivity.class);
			startActivity(intent);
		}
	}
}
