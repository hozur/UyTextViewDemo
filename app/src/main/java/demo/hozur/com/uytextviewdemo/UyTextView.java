package demo.hozur.com.uytextviewdemo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class UyTextView extends TextView {
    public UyTextView(Context context) {
        super(context);
        init(context, null);
    }

    public UyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public UyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        Typeface typeFace = TypeFaceUtil.getTypeFace(context, attrs);
        if (typeFace != null) {
            setTypeface(typeFace);
        }
    }

    public void setFontName(String s) {
        Typeface typeFace = TypeFaceUtil.getTypeFace(getContext(), s);
        if (typeFace != null) {
            setTypeface(typeFace);
        }
    }
}
