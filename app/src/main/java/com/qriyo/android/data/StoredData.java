package com.qriyo.android.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by DELL on 1/29/2016.
 */
public class StoredData {
    Context context;
SharedPreferences preferences;
        SharedPreferences.Editor preferenceEditor;

public StoredData(Context context) {
        super();
        this.context = context;
        preferences= PreferenceManager.getDefaultSharedPreferences(context);
        preferenceEditor=preferences.edit();
        }

	/*
	 * Login Module data begins
	 * isUserLoggedin()
	 * setUserLoggedin(boolean isLoggedin)
	 * getuserData()
	 * saveUserData(String userData)
	 * logout()
	 */

//----if user is logged in used for navigation from the splash activity
public boolean isUserLoggedin() {
        return preferences.getBoolean("isLoggedin", false);
        }
//-----isUserLoggedin() body ends here---------------------------------------

//--Set the login value------------------------------------------------------
public void setUserLoggedin(boolean isLoggedin)
        {
        preferenceEditor.putBoolean("isLoggedin", isLoggedin);
        preferenceEditor.commit();
        }
//---------setUserLoggedin body ends here-------------------------------------


//-----returns the JSON response saved after login for logged in user
//-----Can be parsed to retrieve the user information----------------
public String getuserData()
        {
        return preferences.getString("saveduserdata", "");
        }
//-------getuserData() body ends here---------------------------------

//------Saves the user data after login-------------------------------
public void saveUserData(String userData)
        {
        preferenceEditor.putString("saveduserdata", userData);
        preferenceEditor.commit();
        }
//---------saveUserData body ends here---------------------------------

//----Cleans the stored data-------------------------------------------
public void logout()
        {
        preferenceEditor.clear();
        preferenceEditor.commit();
        }
        //-----Logout body ends here--------------------------------------------


	/*
	 *  User Login Module related functions ends here
	 */

        }
