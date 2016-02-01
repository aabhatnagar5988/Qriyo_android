package com.qriyo.android.data;

import android.location.Location;

/**
 * Created by DELL on 1/29/2016.
 */
public class AppDelegate {
    public static AppDelegate ad;

    Location currentLocation;
    public static AppDelegate getInstance()
    {
        if(ad!=null)
            return ad;
        else
        {
            ad=new AppDelegate();
            return ad;
        }
    }


    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
