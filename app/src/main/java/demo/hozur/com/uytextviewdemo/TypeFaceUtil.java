package demo.hozur.com.uytextviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;



public class TypeFaceUtil {
    public static Typeface getTypeFace(Context context, AttributeSet attr){
        TypedArray a = context.obtainStyledAttributes(attr, R.styleable.UView);//TypedArray是一个数组容器
        String fontName = a.getString(R.styleable.UView_font);//防止在XML文件里没有定义，就加上了默认值30
        return getTypeFace(context,fontName);
    }
    public static Typeface getTypeFace(Context context, String fontName){
        Typeface fromAsset=null;
        if (fontName!=null && !fontName.equals("")){
            try {
                fromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName + ".ttf");
            }catch (RuntimeException ignored){
            }
        }else {
            fromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/UKIJElipbe.ttf");
        }

        return fromAsset;
    }
}
