package android.qriyo.com.qriyo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.qriyo.android.customview.MyEditText;
import com.qriyo.android.customview.MyTextView;
import com.qriyo.android.utility.CommonViewUtility;

/**
 * Created by DELL on 1/29/2016.
 */
public class SignUpActivity extends Activity{
    ImageView  toplogo;
    MyTextView alreadyMemberlbl,
               qriyolbl,
               signUp
               ;

    MyEditText editName,
            editEmail,
            editPhonenumber,
            editPassword,
            editCPassword
     ;



    private void getUIComponent()
    {
        toplogo=(ImageView)findViewById(R.id.toplogo);
        alreadyMemberlbl=(MyTextView)findViewById(R.id.alreadyMemberlbl);
        signUp=(MyTextView)findViewById(R.id.signUp);

        qriyolbl=(MyTextView)findViewById(R.id.qriyolbl);

        editName=(MyEditText)findViewById(R.id.editName);
        editEmail=(MyEditText)findViewById(R.id.editEmail);
        editPhonenumber=(MyEditText)findViewById(R.id.editPhonenumber);
        editPassword=(MyEditText)findViewById(R.id.editPassword);
        editCPassword=(MyEditText)findViewById(R.id.editCPassword);

    }

    private void adjustUIComponent()
    {
        CommonViewUtility cv=CommonViewUtility.getInstance();
        cv.adjustRelative(toplogo,451,411);
        cv.adjustLinearWidth(editName,900);
        cv.adjustLinearWidth(editPassword,900);
        cv.adjustLinearWidth(editEmail,900);
        cv.adjustLinearWidth(editPhonenumber,900);
        cv.adjustLinearWidth(editCPassword,900);

        cv.adjustRelative(signUp,860,140);

        cv.adjustRelativeMargin(toplogo,100,CommonViewUtility.TOP);

        setDrawableStart(R.drawable.icn_name,editName);
        setDrawableStart(R.drawable.icn_mail,editEmail);
        setDrawableStart(R.drawable.icn_password,editPassword);
        setDrawableStart(R.drawable.icn_password,editCPassword);
        setDrawableStart(R.drawable.icn_phone,editPhonenumber);

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
        setContentView(R.layout.layout_signup);
        getUIComponent();
        adjustUIComponent();
    }
}
