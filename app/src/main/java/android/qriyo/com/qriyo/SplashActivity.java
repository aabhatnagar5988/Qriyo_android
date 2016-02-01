package android.qriyo.com.qriyo;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.qriyo.android.data.AppDelegate;
import com.qriyo.android.data.StoredData;
import com.qriyo.android.utility.CommonViewUtility;
import com.qriyo.android.utility.ConnectionDetector;
import com.qriyo.android.utility.GetLocation;
import com.qriyo.android.utility.GotLocationCallback;


public class SplashActivity extends Activity implements GotLocationCallback{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setDisplay();
        getCurrentLocation();
    }

    private void getCurrentLocation()
    {
        if(new ConnectionDetector(this).isConnectingToInternet()) {
            new GetLocation(this, this).execute();
        }
    }

    private void redirectUser(){
        Intent intent;
       if(new StoredData(this).isUserLoggedin())
       {
           intent=new Intent(this,HomeActivity.class);
       }

        else
       {
           intent=new Intent(this,LoginActivity.class);
       }

       startActivity(intent);
       finish();
    }

    @Override
    public void gotLocation(Location location) {
        Toast.makeText(this,"Location Detected"+location.getLatitude()+","+location.getLongitude(),Toast.LENGTH_LONG).show();
        AppDelegate ad=AppDelegate.getInstance();
        ad.setCurrentLocation(location);
        redirectUser();
    }

    private void setDisplay()
    {
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        CommonViewUtility.getInstance().setScreen(dm.widthPixels,dm.heightPixels,dm.density);
    }
}
