package com.careeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class addCareer extends AppCompatActivity {

    FloatingActionButton backBtn, addBtn;
    EditText jobTitle, studyYearsEt, workYearsEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_career);

        setData();
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jobTitle.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "El nombre del empleo no puede ser nulo", Toast.LENGTH_SHORT).show();
                }else{
                    String titulo = jobTitle.getText().toString();
                    int studyYears = 0;
                    int workYears = 0;
                    if (studyYearsEt.getText().toString()!="" || studyYearsEt.getText().toString()=="0"){
                        studyYears = Integer.parseInt(studyYearsEt.getText().toString());
                    }
                    if (workYearsEt.getText().toString()!="" || workYearsEt.getText().toString()=="0"){
                        workYears = Integer.parseInt(workYearsEt.getText().toString());
                    }

                    //Cambiar de pantalla
                }
            }
        });
    }

    private void setData() {
        backBtn = findViewById(R.id.add_back_btn);
        addBtn = findViewById(R.id.add_add_btn);
        jobTitle = findViewById(R.id.job_title);
        studyYearsEt = findViewById(R.id.add_study_years);
        workYearsEt = findViewById(R.id.add_work_years);
    }
}