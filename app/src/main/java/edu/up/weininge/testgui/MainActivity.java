package edu.up.weininge.testgui;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    // this is branch master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.build_menu_old);

        boardSurfaceView gameBoardSurfaceView = new boardSurfaceView(this);

        Canvas canvas = new Canvas();


        gameBoardSurfaceView.draw(canvas);

    }
}
