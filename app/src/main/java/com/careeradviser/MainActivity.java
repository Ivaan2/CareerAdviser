package com.careeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton addCareerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCareerBtn = this.findViewById(R.id.addCareerBtn);
        addCareerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.title);
                if ((tv.getVisibility() == View.VISIBLE)) {
                    tv.setVisibility(View.INVISIBLE);
                } else {
                    tv.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}