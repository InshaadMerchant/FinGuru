package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class UserList_Education_Loan extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    MyAdapter_Education_Loan myAdapter;
    ArrayList<User_Education_Loan> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list_education_loan);
        recyclerView = findViewById(R.id.user_list_education);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        // Add hardcoded User_Auto_Insurance objects with the provided policies
        list.add(new User_Education_Loan("EduFin Bank", "Undergraduate Student Loan", "4 years", "$25,000 per year",
                "4.5%"));

        list.add(new User_Education_Loan("SmartEd Loans", "Graduate Student Loan", "2 years", "$15,000 per year",
                "5.0%"));

        list.add(new User_Education_Loan("EduFund Credit Union", "Vocational Training Loan", "18 months", "$10,000 per year",
                "6.5%"));

        list.add(new User_Education_Loan("Scholarly Financing", "Medical School Loan", "5 years", "$40,000 per year",
                "3.75%"));

        list.add(new User_Education_Loan("TechEd Loans", "STEM Program Loan", "3 years", "$20,000 per year",
                "4.0%"));

        myAdapter = new MyAdapter_Education_Loan(this, list);
        recyclerView.setAdapter(myAdapter);
    }
}