package com.balvin.facedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.balvin.myid.Constants;
import com.balvin.myid.FaceDetection;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FaceDetection faceDetection= new FaceDetection(this);

        faceDetection.call();




    }
}