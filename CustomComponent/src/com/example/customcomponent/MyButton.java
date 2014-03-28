package com.example.customcomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class MyButton extends Button {
	private Context context;

	public MyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		init(attrs);
	}

	private void init(AttributeSet attrs) {
		if (!isInEditMode()) {
			TypedArray a = context.obtainStyledAttributes(attrs,
					R.styleable.com_example_customcomponent_MyButton);
			String typeFace = a
					.getString(R.styleable.com_example_customcomponent_MyButton_mytypeface);
			a.recycle();

			setTypeface(typeFace);
		}

	}

	private void setTypeface(String typeFace) {
		if (typeFace != null) {
			Typeface customFont = Typeface.createFromAsset(context.getAssets(),
					typeFace);
			setTypeface(customFont);
		}

	}
}
