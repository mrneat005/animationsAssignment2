package com.example.animationsassignment2;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements Buittons.myListener{
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void onButtonClicked(int animationValue) {

        FragmentManager myFM = getSupportFragmentManager();
        Picture pAF =(Picture) myFM.findFragmentById(R.id.pictureFragment);
        pAF.startAnimation(animationValue);
    }




}