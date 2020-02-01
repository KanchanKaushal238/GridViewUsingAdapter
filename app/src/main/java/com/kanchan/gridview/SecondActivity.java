package com.kanchan.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        selectedImage = findViewById(R.id.imageView);
        Intent intent = getIntent();
        selectedImage.setImageResource(intent.getIntExtra("image", 0));


    }
}
