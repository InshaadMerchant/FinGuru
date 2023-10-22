package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EducationLoan extends AppCompatActivity {
    String institution, guaranteer_name;
    int sat, sevis, fed_aid, guaranteer_income, current_scholarship;

    FirebaseDatabase database;
    DatabaseReference reference;
    TextInputEditText Sat, Sevis, Fed_aid,Guaranteer_income, Current_scholarship, Institution, Guaranteer_name;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_loan);
        Sat = findViewById(R.id.sat_score);
        Sevis = findViewById(R.id.sat_score);
        Fed_aid = findViewById(R.id.sat_score);
        Guaranteer_income = findViewById(R.id.sat_score);
        Current_scholarship = findViewById(R.id.sat_score);
        Institution = findViewById(R.id.sat_score);
        Guaranteer_name= findViewById(R.id.sat_score);
        next= findViewById(R.id.educationButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users_education");
                String SAT = Sat.getText().toString();
                institution = Institution.getText().toString();
                guaranteer_name = Guaranteer_name.getText().toString();
                String SEVIS = Sevis.getText().toString();
                String FED_AID = Fed_aid.getText().toString();
                String Gurranteer_Income = Guaranteer_income.getText().toString();
                String CURRENT_SCHOLAR = Current_scholarship.getText().toString();
                sat = Integer.parseInt(SAT);
                sevis = Integer.parseInt(SEVIS);
                fed_aid = Integer.parseInt(FED_AID);
                guaranteer_income = Integer.parseInt(Gurranteer_Income);
                current_scholarship = Integer.parseInt(CURRENT_SCHOLAR);
                HelperClass_EducationLoan helperClass_educationLoan= new HelperClass_EducationLoan(institution,guaranteer_name,sat,sevis,fed_aid,guaranteer_income,current_scholarship);
                reference.child("EducationLoan").setValue(helperClass_educationLoan);
                Intent intent = new Intent(EducationLoan.this, UserList_Education_Loan.class);// Change to RecyclerView
                startActivity(intent);

            }
        });


    }
}