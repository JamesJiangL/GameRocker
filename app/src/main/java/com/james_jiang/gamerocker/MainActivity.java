package com.james_jiang.gamerocker;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.james_jiang.gamerocker.game_rocker.GameRocker;
import com.james_jiang.gamerocker.game_rocker.GameRockerListener;

public class MainActivity extends Activity implements GameRockerListener{
    private final static String TAG = "MainActivity";
    private GameRocker gameRocker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        gameRocker = (GameRocker) findViewById(R.id.game_rocker);
        setOnListener();
    }
    private void setOnListener(){
        gameRocker.setOnGameRockerListener(this);
    }

    @Override
    public void onDirection(float x, float y) {
        Log.e(TAG, "x = " + x + ", y = " + y);
    }
}
