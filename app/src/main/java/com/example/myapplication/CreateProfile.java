package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateProfile extends AppCompatActivity {
    TextInputEditText Age, Monthly_Income, Monthly_saving, Gross_Loan_Installment, Credit_score , occupation;
    int age_int,monthly_income_int,monthly_saving_int,Total_loan_inst_int,credit_sc_int;
    Button submitBtn;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        Intent intent = getIntent();

        String name = intent.getStringExtra("email");



        Age = findViewById(R.id.Age);
        Monthly_Income = findViewById(R.id.monthly_income);
        Monthly_saving = findViewById(R.id.monthly_saving);
        Gross_Loan_Installment = findViewById(R.id.loan_installment);
        Credit_score = findViewById(R.id.credit_score);
        occupation= findViewById(R.id.occupation);

        submitBtn = findViewById(R.id.Submit_button);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users_profile");
                String age = Age.getText().toString();
                String income = Monthly_Income.getText().toString();
                String saving = Monthly_saving.getText().toString();
                String Total_Loan = Gross_Loan_Installment.getText().toString();
                String credit_score = Credit_score.getText().toString();
                String Occupation = occupation.getText().toString();
                age_int= Integer.parseInt(age);
                monthly_income_int= Integer.parseInt(income);
                monthly_saving_int= Integer.parseInt(saving);
                credit_sc_int= Integer.parseInt(credit_score);
                Total_loan_inst_int= Integer.parseInt(Total_Loan);


                HelperClass_Profile helperClass_profile = new HelperClass_Profile( age_int,  monthly_income_int, monthly_saving_int,Total_loan_inst_int,credit_sc_int,Occupation);
                reference.child("Athrva").setValue(helperClass_profile);
                Toast.makeText(CreateProfile.this, "Profile Creation Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateProfile.this, LoginActivity.class);

                startActivity(intent);

            }
        });

    }
}