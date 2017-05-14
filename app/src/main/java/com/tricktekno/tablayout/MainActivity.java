package com.tricktekno.tablayout;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EasySplashScreen config = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(AndroidTabLayoutActivity.class)
                .withSplashTimeOut(4000)
                .withBackgroundResource(android.R.color.holo_red_light)
                .withHeaderText("LEARN ANDROID")
                .withFooterText("Copyright 2016")
                .withBeforeLogoText("Easy to learn")
                .withLogo(R.drawable.logo)
                .withAfterLogoText("Build by: OPTNIO00");


        //set your own animations
        myCustomTextViewAnimation(config.getFooterTextView());

        //customize all TextViews
        Typeface pacificoFont = Typeface.createFromAsset(getAssets(), "Pacifico.ttf");
        config.getAfterLogoTextView().setTypeface(pacificoFont);

        config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);

        //create the view
        View easySplashScreenView = config.create();

        setContentView(easySplashScreenView);
    }

    private void myCustomTextViewAnimation(TextView tv){
        Animation animation=new TranslateAnimation(0,0,480,0);
        animation.setDuration(1200);
        tv.startAnimation(animation);
    }
}
