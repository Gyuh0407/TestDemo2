package com.example.testdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view1);
        imageView = (ImageView) findViewById(R.id.image_view2);
        imageView = (ImageView) findViewById(R.id.image_view3);
        textView = (TextView) findViewById(R.id.first);
        textView = (TextView) findViewById(R.id.second);
        textView = (TextView) findViewById(R.id.third);


    }
}