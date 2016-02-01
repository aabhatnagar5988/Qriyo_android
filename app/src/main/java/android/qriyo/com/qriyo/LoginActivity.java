package android.qriyo.com.qriyo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.qriyo.android.customview.MyEditText;
import com.qriyo.android.customview.MyTextView;
import com.qriyo.android.utility.CommonViewUtility;

/**
 * Created by DELL on 1/29/2016.
 */
public class LoginActivity extends Activity{
    ImageView  toplogo;
    MyTextView forgetPassword,
               signup,
               qriyolbl,
               login,
               fbbutton;

    MyEditText editUserName,
               editPassword;



    private void getUIComponent()
    {
        toplogo=(ImageView)findViewById(R.id.toplogo);
        forgetPassword=(MyTextView)findViewById(R.id.forgetPassword);
        signup=(MyTextView)findViewById(R.id.signup);
        forgetPassword=(MyTextView)findViewById(R.id.forgetPassword);
        qriyolbl=(MyTextView)findViewById(R.id.qriyolbl);
        login=(MyTextView)findViewById(R.id.login);
        fbbutton=(MyTextView)findViewById(R.id.fbbutton);
        editUserName=(MyEditText)findViewById(R.id.editUserName);
        editPassword=(MyEditText)findViewById(R.id.editPassword);
    }

    private void adjustUIComponent()
    {
        CommonViewUtility cv=CommonViewUtility.getInstance();
        cv.adjustRelative(toplogo,451,411);
        cv.adjustLinearWidth(editUserName,900);
        cv.adjustLinearWidth(editPassword,900);
        cv.adjustLinear(login,860,140);
        cv.adjustLinear(fbbutton,860,140);
        cv.adjustRelativeMargin(toplogo,250,CommonViewUtility.TOP);

        setDrawableStart(R.drawable.icn_name,editUserName);
        setDrawableStart(R.drawable.icn_password,editPassword);

    }

    private void setonclicklistener()
    {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));

            }
        });

        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ForgetPassword.class));
            }
        });
    }


    private void setDrawableStart(int resource,EditText et)
    {
        Drawable drawable = getResources().getDrawable(resource);
        drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*0.3),
                (int)(drawable.getIntrinsicHeight()*0.3));
        ScaleDrawable sd = new ScaleDrawable(drawable, 0, 20, 20);

        et.setCompoundDrawables(sd.getDrawable(), null, null, null);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        getUIComponent();
        adjustUIComponent();
        setonclicklistener();
    }
}
