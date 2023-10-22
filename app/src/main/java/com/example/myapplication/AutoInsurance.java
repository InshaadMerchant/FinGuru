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

public class AutoInsurance extends AppCompatActivity {
    FirebaseDatabase database;
    int Vin_number , Year, Driver_license, Down_payment, monthly_Payment;
    String Make, Model;
    DatabaseReference reference;
    TextInputEditText vin_number , make, model, year, driver_license, down_payment, Monthly_Payment;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_insurance);

        vin_number = findViewById(R.id.vin_Number);
        make = findViewById(R.id.vin_Number);
        model = findViewById(R.id.vin_Number);
        year = findViewById(R.id.vin_Number);
        driver_license = findViewById(R.id.vin_Number);
        down_payment = findViewById(R.id.vin_Number);
        Monthly_Payment =findViewById(R.id.monthly_installments);
        next = findViewById(R.id.next_btn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users_auto_data");
                String vin = vin_number.getText().toString();
                Model = vin_number.getText().toString();
                Make = vin_number.getText().toString();
                String YeaR = vin_number.getText().toString();
                String driverLicense = vin_number.getText().toString();
                String Down_pay = vin_number.getText().toString();
                String Monthly_Pay = vin_number.getText().toString();
                Vin_number = Integer.parseInt(vin);
                Year = Integer.parseInt(YeaR);
                Driver_license = Integer.parseInt(driverLicense);
                Down_payment = Integer.parseInt(Down_pay);
                monthly_Payment = Integer.parseInt(Monthly_Pay);

                HelperClass_AutoInsurance helperClass_autoInsurance = new HelperClass_AutoInsurance( Vin_number,  Year, Driver_license,  Down_payment,  monthly_Payment,  Make, Model);
                reference.child("AutoDetails").setValue(helperClass_autoInsurance);
                Intent intent = new Intent(AutoInsurance.this, UserList.class);// Change to RecyclerView
                startActivity(intent);
            }
        });


    }
}