package edu.up.weininge.testgui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.ArrayList;

public class boardSurfaceView extends SurfaceView{

    public boardSurfaceView(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public boardSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        Paint redPaint = new Paint();
        redPaint.setStyle(Paint.Style.FILL);
        redPaint.setColor(Color.RED);
        canvas.drawCircle(100f, 100f, 100f, redPaint);

        ArrayList<Hexagon> hexagons = new ArrayList<Hexagon>();

        hexagons.add(new Hexagon(this.getContext(), 100, 100));

        for(Hexagon hexagon :hexagons) {
            hexagon.draw(canvas);
        }

    }
}
