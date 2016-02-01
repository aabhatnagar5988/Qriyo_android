package com.qriyo.android.utility;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;

/**
 * Created by DELL on 1/29/2016.
 */
public class GetLocation extends AsyncTask<Integer, Integer, Integer> {
    Location location;
    String address = "";
    Context context;

    GotLocationCallback callback;
    public GetLocation(Context context,GotLocationCallback callback) {
        super();

        this.context=context;
        this.callback=callback;
    }


    @Override
    protected Integer doInBackground(Integer... params) {
        // TODO Auto-generated method stub
        LegacyLastLocationFinder lfinder = new LegacyLastLocationFinder(
                context, callback);

        location = lfinder.getLastBestLocation(10, 10);


        return null;
    }

    @Override
    protected void onPostExecute(Integer result) {
        // TODO Auto-generated method stub
        super.onPostExecute(result);
        if (location != null) {
            callback.gotLocation(location);
        }
    }

}

