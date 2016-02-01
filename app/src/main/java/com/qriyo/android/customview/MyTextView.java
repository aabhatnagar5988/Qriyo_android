package com.qriyo.android.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView{

	Typeface tf;
	public MyTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-Light.ttf");
		this.setTypeface(tf);
	}

	public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-Light.ttf");
		this.setTypeface(tf);
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-Light.ttf");
		this.setTypeface(tf);
	}
   
	
}
