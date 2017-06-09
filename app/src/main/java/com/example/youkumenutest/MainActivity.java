package com.example.youkumenutest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView IconMenu;
    private ImageView IconHome;

    private RelativeLayout level1;
    private RelativeLayout level2;
    private RelativeLayout level3;
    private boolean isLevel3Show = true;
    private boolean isLevel2Show = true;
    private final static int time = 500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IconHome = (ImageView) findViewById(R.id.img_home);
        IconMenu = (ImageView) findViewById(R.id.img_menu);
        IconHome.setOnClickListener(this);
        IconMenu.setOnClickListener(this);
        level1 = (RelativeLayout) findViewById(R.id.level1);
        level2 = (RelativeLayout) findViewById(R.id.level2);
        level3 = (RelativeLayout) findViewById(R.id.level3);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_menu:
                if(isLevel3Show){
                    Myutil.startAnimOut(level3);
                }else{
                    Myutil.startAnimIn(level3);
                }
                isLevel3Show = !isLevel3Show;
                break;
            case R.id.img_home:
                if(isLevel2Show){
                    Myutil.startAnimOut(level2);

                    Myutil.startAnimOutSoon(level3,time);
                }else{
                    Myutil.startAnimIn(level2);

                    Myutil.startAnimInSoon(level3,time);
                }
                isLevel2Show = !isLevel2Show;
                break;
            default:
                break;

        }
    }
}
