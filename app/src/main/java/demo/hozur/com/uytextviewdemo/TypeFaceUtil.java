package demo.hozur.com.uytextviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import java.util.LinkedHashMap;
import java.util.Map;


public class TypeFaceUtil {

    public static final String DEFAULT_FONT = "msuighur";
    private static Map<String, Typeface> typefaceMap = new LinkedHashMap<>();

    public static Typeface getTypeFace(Context context, AttributeSet attr) {
        TypedArray a = context.obtainStyledAttributes(attr, R.styleable.CoolView);//TypedArray是一个数组容器
        String fontName = a.getString(R.styleable.CoolView_font);//防止在XML文件里没有定义，就加上了默认值30
        a.recycle();
        return getTypeFace(context, fontName);
    }

    public static Typeface getTypeFace(Context context, String fontName) {

        if (typefaceMap.containsKey(fontName)) {
            return typefaceMap.get(fontName);
        }

        Typeface fromAsset = null;
        if (fontName != null && !fontName.equals("")) {
            try {
                fromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName + ".ttf");
                typefaceMap.put(fontName, fromAsset);

            } catch (RuntimeException ignored) {
                ignored.printStackTrace();
            }
        } else {
            return getTypeFace(context, DEFAULT_FONT);
        }

        return fromAsset;
    }
}
