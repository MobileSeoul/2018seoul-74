package com.example.bbarroo.awesome;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class loading extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);
        startLoading();
    }
    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }
}

/*
Intent intent = new Intent(this, loading.class);
        startActivity(intent);
 */