package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeLoan extends AppCompatActivity {
    String Area_of_property;
    int annual_income, current_value_of_property, zipcode, realtor_license, realtor_phone_no;
    FirebaseDatabase database;
    DatabaseReference reference;
    TextInputEditText Annual_income, Current_value_of_property, Zipcode, Realtor_license, Realtor_Phone_no, area_of_property;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_loan);
        Annual_income = findViewById(R.id.annual_income);
        Current_value_of_property = findViewById(R.id.property_valuation);
        Zipcode = findViewById(R.id.zipcode);
        Realtor_license = findViewById(R.id.realtor_licensing_number);
        Realtor_Phone_no = findViewById(R.id.realtor_number);
        area_of_property = findViewById(R.id.property_location);
        next = findViewById(R.id.home_loan_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users_homeloan");
                String ANNUAL_INCOME = Annual_income.getText().toString();
                String CURRENT_VALUE = Annual_income.getText().toString();
                String ZIPCODE = Annual_income.getText().toString();
                String REALTOR_LICENSE = Annual_income.getText().toString();
                String REALTOR_PHONE = Annual_income.getText().toString();
                Area_of_property = area_of_property.getText().toString();
                annual_income = Integer.parseInt(ANNUAL_INCOME);
                current_value_of_property = Integer.parseInt(CURRENT_VALUE);
                zipcode = Integer.parseInt(ZIPCODE);
                realtor_license = Integer.parseInt(REALTOR_LICENSE);
                realtor_phone_no = Integer.parseInt(REALTOR_PHONE);
                HelperClass_HomeLoan helperClass_homeLoan = new HelperClass_HomeLoan(Area_of_property,annual_income, current_value_of_property, zipcode, realtor_license, realtor_phone_no);
                reference.child("HomeLoan").setValue(helperClass_homeLoan);
                Intent intent = new Intent(HomeLoan.this, Userlist_Home_Loan.class);// Change to RecyclerView
                startActivity(intent);
            }
        });


    }
}