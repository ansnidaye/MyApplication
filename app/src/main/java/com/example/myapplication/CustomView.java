//package com.example.myapplication;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.util.AttributeSet;
//import android.view.View;
//import android.widget.ImageView;
//
///**
// * Created by 华硕 on 2016/1/18.
// */
//public class CustomView extends ImageView {
//
//    private boolean isCheck;
//
//    public CustomView(Context context) {
//        super(context);
//    }
//
//    public CustomView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public boolean isCheck() {
//        return isCheck;
//    }
//
//    public void setCheck(boolean check) {
//        isCheck = check;
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        roundImage(canvas);
//    }
//
//    public void roundImage(Canvas canvas){
//        Drawable drawable = getDrawable();
//
//        if (drawable == null) {
//            return;
//        }
//
//        if (getWidth() == 0 || getHeight() == 0) {
//            return;
//        }
//
//        Bitmap b = ((BitmapDrawable) drawable).getBitmap();
//
//        if (null == b) {
//            return;
//        }
//
//        Bitmap bitmap = b.copy(Bitmap.Config.ARGB_8888, true);
//
//        int w = getWidth(), h = getHeight();
//
//        Bitmap roundBitmap = getCroppedBitmap(bitmap, w);
//        canvas.drawBitmap(roundBitmap, 0, 0, null);
//
//        if(isCheck){
//            Paint paint = new Paint();
//            //设置画笔颜色
//            paint.setColor(0x905EA7E7);
//            //设置圆弧的宽度
//            paint.setStrokeWidth(8);
//            //设置圆弧为空心
//            paint.setStyle(Paint.Style.FILL);
//            //消除锯齿
//            paint.setAntiAlias(true);
//
//            //获取圆心的x坐标
//            int center = getWidth() / 2;
//            int sX = center - getWidth() / 8;
//            int sY = center - getWidth() / 10;
//            int cX = sX - getWidth() / 10;
//            int cY = center + getWidth() / 8;
//            int eX = center + getWidth() / 5;
//            int eY = center - getWidth() / 5;
//            //圆弧半径
//            int radius = getWidth() / 2;
//            //画圆
//            canvas.drawCircle(radius,radius,radius,paint);
//
//            paint.setColor(Color.WHITE);
//
//            //画第一根线
//            canvas.drawLine(w/8*3,w/2,w/16*7+1,w/8*5,paint);
//
//            canvas.drawLine(w/16*7-2,w/8*5,w/8*5,w/8*3,paint);
//        }
//
//    }
//}
