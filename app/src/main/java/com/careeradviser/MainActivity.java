package com.careeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton addCareerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCareerBtn = this.findViewById(R.id.addCareerBtn);
        //addCareerBtn.setOnClickListener();
    }
}