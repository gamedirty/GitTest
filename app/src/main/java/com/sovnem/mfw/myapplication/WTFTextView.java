package com.sovnem.mfw.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by zhjh on 2018/4/12.
 */

public class WTFTextView extends android.support.v7.widget.AppCompatTextView {
    private Paint paint;
    private int lineHeight = 16;
    private int w,h;

    public WTFTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setIncludeFontPadding(false);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(lineHeight);
        paint.setColor(0xFFFFDB26);
        System.out.print(2);
        System.out.print(2);
        System.out.print(2);
        System.out.print(2);
    }

    public WTFTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public WTFTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        lineHeight = (int) getPaint().descent();
        canvas.drawLine(lineHeight, h - lineHeight, w - lineHeight, h - lineHeight, paint);
        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.w = w;
        this.h = h;
    }
}
