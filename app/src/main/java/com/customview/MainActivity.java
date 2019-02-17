package com.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView mContentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentTv = findViewById(R.id.contentTv);

        mContentTv.setMovementMethod(ScrollingMovementMethod.getInstance());
//        android:scrollbarThumbVertical="@drawable/ic_launcher"   //滑块的图片
//        android:scrollbarTrackVertical="@drawable/ic_launcher"   //滑道的图片
    }
}
