package com.androidtraining.animationexample;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameAnimationActivity extends Activity {
	private ImageView image;
	private AnimationDrawable frameAnimation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_animation_activity);
		image = (ImageView) findViewById(R.id.image);
		image.setBackgroundResource(R.drawable.frame_animation);
		frameAnimation = (AnimationDrawable) image.getBackground();
	}

	// Called when Activity becomes visible or invisible to the user
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			// Starting the animation when in Focus
			frameAnimation.start();
		} else {
			// Stoping the animation when not in Focus
			frameAnimation.stop();
		}
	}

}
