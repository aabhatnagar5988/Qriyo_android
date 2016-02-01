package com.qriyo.android.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.EditText;

public class CommonDataUtility {

	Context con;

	public String etData(EditText edit) {
		return edit.getText().toString();
	}

	public boolean matchText(EditText edit,EditText edit1)
	{
		 if(etData(edit).equalsIgnoreCase(etData(edit1)))
			 return true;
		 else 
			 return false;
	}
	
	
	public boolean isValidEmail(CharSequence target) {
	    if (target == null) {
	        return false;
	    } else {
	        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
	    }
	}
	
	public CommonDataUtility(Context con) {
		super();
		this.con = con;
	}

	public boolean isNetworkConnected() {
		ConnectivityManager cm = (ConnectivityManager) con
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getActiveNetworkInfo();
		if (ni == null) {
			// There are no active networks.
			return false;
		} else
			return true;
	}

}
