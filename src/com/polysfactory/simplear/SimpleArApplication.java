package com.polysfactory.simplear;

import org.opencv.android.OpenCVLoader;

import android.app.Application;

public class SimpleArApplication extends Application {
    static {
        if (!OpenCVLoader.initDebug()) {
            // Handle initialization error
        } else {
            System.loadLibrary("simple_ar_marker");
            System.loadLibrary("simple_ar");
        }
    }

    public void onCreate() {
    };
}
