package com.qriyo.android.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

public class MyEditText extends EditText{

	Typeface tf;
	public MyEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-ExtraLight.ttf");
		this.setTypeface(tf);
	}

	public MyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-ExtraLight.ttf");
		this.setTypeface(tf);
	}

	public MyEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		tf=Typeface.createFromAsset(context.getAssets(), "Raleway-ExtraLight.ttf");
		this.setTypeface(tf);
	}
   
	
}
