package com.qriyo.android.utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;

public class CommonViewUtility {

	public static CommonViewUtility cu;
	int w, h;
	float density;
	public static final int TOP = 1;
	public static final int BOTTOM = 2;
	public static final int RIGHT = 3;
	public static final int LEFT = 4;
	
	Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public static CommonViewUtility getInstance() {
		if (cu != null)
			return cu;
		else {
			cu = new CommonViewUtility();
			return cu;
		}
	}

	public void setScreen(int width, int height, float den) {
		this.w = width;
		this.h = height;
		this.density = den;
	}

	public float getDensity() {
		return density;
	}

	public int calculateHeight(int height) {
		int he = (height * h) / 1920;
		return he;
	}

	public int calculateWidth(int height) {
		int he = (height * w) / 1080;
		return he;
	}

	public void adjustRelative(View view, int width, int height) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height = calculateHeight(height);
		view.setLayoutParams(lp);
	}
	
	
	public void adjustRelative(View view,int resource) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		Bitmap bm=BitmapFactory.decodeResource(activity.getResources(), resource);
		lp.width = calculateWidth(bm.getWidth());
		lp.height = calculateHeight(bm.getHeight());
		view.setLayoutParams(lp);
	}
	
	
	public void adjustRelativeCircle(View view, int width) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height= calculateWidth(width);
		view.setLayoutParams(lp);
	}

	public void adjustRelativeWidth(View view, int width) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		lp.width = calculateWidth(width);
		view.setLayoutParams(lp);

	}
	
	public void adjustTableWidth(View view, int width) {
		TableRow.LayoutParams lp = (TableRow.LayoutParams) view.getLayoutParams();
		lp.width = calculateWidth(width);
		view.setLayoutParams(lp);

	}

	public void adjustRelativeHeight(View view, int width) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		lp.height = calculateHeight(width);
		view.setLayoutParams(lp);

	}

	public void adjustLinear(View view, int width, int height) {
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height = calculateHeight(height);
		view.setLayoutParams(lp);
	}
	
	public void adjustLinearCircle(View view, int width) {
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height = calculateWidth(width);
		view.setLayoutParams(lp);
	}
	
	public void adjustFrame(View view, int width, int height) {
		FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height = calculateHeight(height);
		view.setLayoutParams(lp);
	}
	
	
	public void adjustView(View view, int width, int height) {
		ViewGroup.LayoutParams lp = (ViewGroup.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		lp.height = calculateHeight(height);
		view.setLayoutParams(lp);
	}

	public void adjustLinearHeight(View view, int height) {
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view
				.getLayoutParams();
		lp.height = calculateHeight(height);
		view.setLayoutParams(lp);
	}

	public void adjustLinearWidth(View view, int width) {
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		view.setLayoutParams(lp);
	}

	public void adjustframeWidth(View view, int width) {
		FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view
				.getLayoutParams();
		lp.width = calculateWidth(width);
		view.setLayoutParams(lp);
	}
	
	
	public void adjustRelativeMargin(View view, int width, int marginCode) {
		LayoutParams lp = (LayoutParams) view.getLayoutParams();
		if (marginCode == TOP) {
			lp.topMargin = calculateHeight(width);
		}

		else if (marginCode == BOTTOM) {
			lp.bottomMargin = calculateHeight(width);
		}

		else if (marginCode == LEFT) {
			lp.leftMargin = calculateWidth(width);
		}

		else if (marginCode == RIGHT) {
			lp.rightMargin = calculateWidth(width);
		}

		view.setLayoutParams(lp);
	}

	
	public void adjustFrameMargin(View view, int width, int marginCode) {
		FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
		if (marginCode == TOP) {
			lp.topMargin = calculateHeight(width);
		}

		else if (marginCode == BOTTOM) {
			lp.bottomMargin = calculateHeight(width);
		}

		else if (marginCode == LEFT) {
			lp.leftMargin = calculateWidth(width);
		}

		else if (marginCode == RIGHT) {
			lp.rightMargin = calculateWidth(width);
		}

		view.setLayoutParams(lp);
	}
	
	
	public Bitmap getRoundedShape(Bitmap scaleBitmapImage, int targetWidth,
			int targetHeight) {

		Bitmap targetBitmap = Bitmap.createBitmap(targetWidth, targetHeight,
				Bitmap.Config.ARGB_8888);

		Canvas canvas = new Canvas(targetBitmap);
		Path path = new Path();
		path.addCircle(((float) targetWidth - 1) / 2,
				((float) targetHeight - 1) / 2,
				(Math.min(((float) targetWidth), ((float) targetHeight)) / 2),
				Path.Direction.CCW);

		canvas.clipPath(path);
		Bitmap sourceBitmap = scaleBitmapImage;
		canvas.drawBitmap(sourceBitmap, new Rect(0, 0, sourceBitmap.getWidth(),
				sourceBitmap.getHeight()), new Rect(0, 0, targetWidth,
				targetHeight), null);
		return targetBitmap;
	}

	public void adjustLinearMargin(View view, int width, int marginCode) {
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view
				.getLayoutParams();
		if (marginCode == TOP) {
			lp.topMargin = calculateHeight(width);
		}

		else if (marginCode == BOTTOM) {
			lp.bottomMargin = calculateHeight(width);
		}

		else if (marginCode == LEFT) {
			lp.leftMargin = calculateWidth(width);
		}

		else if (marginCode == RIGHT) {
			lp.rightMargin = calculateWidth(width);
		}

		view.setLayoutParams(lp);
	}

	public void raiseToast(String text, Context con) {

		Builder builder = new Builder(con);
		builder.setMessage(text);
		builder.setPositiveButton("Ok", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});

		builder.show();
	}

	public void ridirect(String text, Context con,
			OnClickListener listener,
			DialogInterface.OnDismissListener dismisslistener) {

		Builder builder = new Builder(con);
		builder.setMessage(text);
		builder.setPositiveButton("Ok", listener);
		AlertDialog ad = builder.create();
		ad.setOnDismissListener(dismisslistener);
		ad.show();
	}

	public void ridirectButtons(String text, Context con,
			OnClickListener listener,
			DialogInterface.OnDismissListener dismisslistener) {

		Builder builder = new Builder(con);
		builder.setMessage(text);
		builder.setPositiveButton("Yes", listener);
		builder.setNegativeButton("No", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		AlertDialog ad = builder.create();
		ad.setOnDismissListener(dismisslistener);

		ad.show();
	}

	

}
