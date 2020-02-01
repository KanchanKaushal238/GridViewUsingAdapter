package com.kanchan.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView simpleGridView;

    int[] img = {R.drawable.abc,
                 R.drawable.da,
                 R.drawable.download,
                 R.drawable.downloadm,
                 R.drawable.medicine,
                 R.drawable.panda,
                 R.drawable.pictures,
                 R.drawable.sleep,
                 R.drawable.sleepypanda,
                 R.drawable.tumblr,
                 R.drawable.venomous,
                 R.drawable.saa,
                 R.drawable.sbbn,
                 R.drawable.su,
                 R.drawable.tr,
                 R.drawable.pop,
                 R.drawable.sad,
                 R.drawable.amkp,
                 R.drawable.amn,
                 R.drawable.fl};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGridView = findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), img);
        simpleGridView.setAdapter(customAdapter);

        simpleGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("image", img);
                startActivity(intent);

            }
        });

    }
}
