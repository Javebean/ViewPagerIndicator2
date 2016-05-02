package com.example.jake.viewpagerindicator2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jake on 2016/5/1.
 *
 * 如何将图像延伸到屏幕宽度，同时保持纵横比？
 * http://stackoverflow.com/questions/2991110/android-how-to-stretch-an-image-to-the-screen-width-while-maintaining-aspect-ra
 */

public class Banner extends View {

    private final Drawable logo;

    public Banner(Context context) {
        super(context);
        logo = context.getResources().getDrawable(R.drawable.lunbo);
        //setBackgroundDrawable(logo);
        this.setBackground(logo);
    }

    public Banner(Context context, AttributeSet attrs) {
        super(context, attrs);
        logo = context.getResources().getDrawable(R.drawable.lunbo);
        //setBackgroundDrawable(logo);
        this.setBackground(logo);
    }

    public Banner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        logo = context.getResources().getDrawable(R.drawable.lunbo);
        //setBackgroundDrawable(logo);
        this.setBackground(logo);
    }

    @Override protected void onMeasure(int widthMeasureSpec,
                                       int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = width * logo.getIntrinsicHeight() / logo.getIntrinsicWidth();
        setMeasuredDimension(width, height);
    }
}
