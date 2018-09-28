package com.sovnem.mfw.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zhjh on 2018/4/2.
 */

public class Kaka extends View {
    public Kaka(Context context) {
        super(context);
    }

    public Kaka(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Kaka(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }
}
