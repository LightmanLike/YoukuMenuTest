package com.example.youkumenutest;

import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

/**
 * Created by Light on 2017/6/9.
 */

public class Myutil {

    private final static float fromDegress = 0;
    private final static float toDegress = 180;
    private final static float finalDegress = 360;
    private final static int during = 600;


    public static void startAnimOut(RelativeLayout view) {
        RotateAnimation animation = new RotateAnimation(fromDegress,toDegress,view.getWidth()/2,view.getHeight());
        animation.setDuration(during);
        animation.setFillAfter(true);
        view.startAnimation(animation);
    }

    public static void startAnimIn(RelativeLayout view) {
        RotateAnimation animation = new RotateAnimation(toDegress,finalDegress,view.getWidth()/2,view.getHeight());
        animation.setDuration(during);
        animation.setFillAfter(true);
        view.startAnimation(animation);
    }

    public static void startAnimOutSoon(RelativeLayout view, int time) {
        RotateAnimation animation = new RotateAnimation(fromDegress,toDegress,view.getWidth()/2,view.getHeight());
        animation.setDuration(during);
        animation.setStartOffset(time);
        animation.setFillAfter(true);
        view.startAnimation(animation);
    }

    public static void startAnimInSoon(RelativeLayout view, int time) {
        RotateAnimation animation = new RotateAnimation(toDegress,finalDegress,view.getWidth()/2,view.getHeight());
        animation.setDuration(during);
        animation.setStartOffset(time);
        animation.setFillAfter(true);
        view.startAnimation(animation);
    }
}
