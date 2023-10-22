package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class Userlist_Home_Loan extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    MyAdapter_Home_Loan myAdapter;
    ArrayList<User_Home_Loan> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist_home_loan);
        recyclerView = findViewById(R.id.userlist_home);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        // Add hardcoded User_Auto_Insurance objects with the provided policies
        list.add(new User_Home_Loan("ABC Bank", "Standard Home Loan", "30 years", "$250,000",
                "3.75% fixed rate"));

        list.add(new User_Home_Loan("XYZ Mortgage", "First-Time Homebuyer Loan", "20 years", "$200,000",
                "3.50% fixed rate"));

        list.add(new User_Home_Loan("Mortgage Masters", "Jumbo Loan for Luxury Homes", "15 years", "$1,000,000",
                "4.0% fixed rate"));

        list.add(new User_Home_Loan("Green Home Loans", "Eco-Friendly Home Loan", "25 years", "$400,000",
                "3.0% fixed rate"));

        list.add(new User_Home_Loan("Affordable Housing Bank", "Low-Income Home Loan", "30 years", "$150,000",
                "3.2% fixed rate"));

        myAdapter = new MyAdapter_Home_Loan(this, list);
        recyclerView.setAdapter(myAdapter);
    }
}