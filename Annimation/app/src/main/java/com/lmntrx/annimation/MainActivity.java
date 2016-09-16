package com.lmntrx.annimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void myAnimation(View view){
        ImageView myImage=(ImageView) findViewById(R.id.imageView);
        myImage.animate().rotation(360).setDuration(3000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
