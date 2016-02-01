package android.qriyo.com.qriyo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.qriyo.android.customview.MyTextView;
import com.qriyo.android.utility.CommonViewUtility;


/**
 * Created by DELL on 1/29/2016.
 */
public class ForgetPassword extends AppCompatActivity {
 Toolbar toolbar;
 ImageView backButton;
 MyTextView toolbar_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_forgetpassword);
        getUIComponent();
        adjustUIComponent();
    }

    private void getUIComponent()
    {
        toolbar=(Toolbar)findViewById(R.id.toolbar);

        toolbar_title=(MyTextView)toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void adjustUIComponent(){
        CommonViewUtility cv=CommonViewUtility.getInstance();

    }
}
