package demo.hozur.com.uytextviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CoolTextView extends TextView {


    public CoolTextView(Context context) {
        super(context);
        init(context, null);
    }

    public CoolTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CoolTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        Typeface typeFace = TypeFaceUtil.getTypeFace(context, attrs);
        setTypeface(typeFace);

    }

    public void setFontName(String s) {
        Typeface typeFace = TypeFaceUtil.getTypeFace(getContext(), s);
        if (typeFace != null) {
            setTypeface(typeFace);
        }
    }
}
