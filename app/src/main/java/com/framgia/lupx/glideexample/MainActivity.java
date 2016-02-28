package com.framgia.lupx.glideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = (ImageView) findViewById(R.id.imgv);
        Glide.
            with(this)
            .load("http://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg")
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(imgv);
    }
}
