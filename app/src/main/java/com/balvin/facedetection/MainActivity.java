package com.balvin.facedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.balvin.myid.Constants;
import com.balvin.myid.FaceDetection;
import com.balvin.myid.IMessageListener;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FaceDetection faceDetection= new FaceDetection(this,"");

        faceDetection.getLiveNess(new IMessageListener() {
            @Override
            public void onSuccess(Object responseMessage) {

            }

            @Override
            public void onFailure(String errorResponseMessage) {

            }
        });




    }
}