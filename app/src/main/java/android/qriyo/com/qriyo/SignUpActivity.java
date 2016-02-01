package android.qriyo.com.qriyo;

import android.app.Activity;
import android.os.Bundle;
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
        cv.adjustRelative(toplogo,451,342);
        cv.adjustLinearWidth(editName,900);
        cv.adjustLinearWidth(editPassword,900);
        cv.adjustLinearWidth(editEmail,900);
        cv.adjustLinearWidth(editPhonenumber,900);
        cv.adjustLinearWidth(editCPassword,900);

        cv.adjustRelative(signUp,860,140);

        cv.adjustRelativeMargin(toplogo,100,CommonViewUtility.TOP);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signup);
        getUIComponent();
        adjustUIComponent();
    }
}
