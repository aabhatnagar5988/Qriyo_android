package com.qriyo.android.utility;

import android.location.Location;
import android.location.LocationListener;

/**
 * Created by DELL on 1/29/2016.
 */
public interface ILastLocationFinder {
    public Location getLastBestLocation(int minDistance, long minTime);
    public void setChangedLocationListener(LocationListener l);
    public void cancel();

}
