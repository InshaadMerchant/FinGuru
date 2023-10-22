package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        TextView home_Loan, auto_Insurance, educationLoan, policyCustomization;
        home_Loan = findViewById(R.id.home_loan);
        auto_Insurance = findViewById(R.id.auto_insurance);
        educationLoan = findViewById(R.id.education_loan);
        policyCustomization = findViewById(R.id.policy_customization);

        auto_Insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, AutoInsurance.class);
                startActivity(intent);
            }
        });
        home_Loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, HomeLoan.class);
                startActivity(intent);
            }
        });
        educationLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, EducationLoan.class);
                startActivity(intent);
            }
        });
        policyCustomization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Future_Policy.class);
                startActivity(intent);
            }
        });

    }
}