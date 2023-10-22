 package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

 public class UserList extends AppCompatActivity {
     RecyclerView recyclerView;
     DatabaseReference database;
     MyAdapter_AutoInsurance myAdapter;
     ArrayList<User_Auto_Insurance> list;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_user_list);

         recyclerView = findViewById(R.id.userList);
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));

         list = new ArrayList<>();

         // Add hardcoded User_Auto_Insurance objects with the provided policies
         list.add(new User_Auto_Insurance("Basic Auto Insurance", "Provides essential coverage for liability, property damage, and medical payments.", "190/month", "12 months",
                 "Bodily Injury Liability: $50,000 per person / $100,000 per accident\nProperty Damage Liability: $25,000 per accident\nMedical Payments: $5,000"));

         list.add(new User_Auto_Insurance("Full Coverage Auto Insurance", "Comprehensive coverage including liability, collision, and comprehensive coverage.", "260/month", "6 months",
                 "Bodily Injury Liability: $100,000 per person / $300,000 per accident\nProperty Damage Liability: $50,000 per accident\nCollision: $500 deductible\nComprehensive: $500 deductible"));

         list.add(new User_Auto_Insurance("Teen Driver Insurance", "Designed for young and inexperienced drivers.", "220/month", "12 months",
                 "Bodily Injury Liability: $25,000 per person / $50,000 per accident\nProperty Damage Liability: $10,000 per accident\nTeen Driver Safety Course Discount"));

         list.add(new User_Auto_Insurance("Luxury Car Insurance", "Specialized coverage for high-end vehicles.", "300/month", "24 months",
                 "Bodily Injury Liability: $250,000 per person / $500,000 per accident\nProperty Damage Liability: $100,000 per accident\nLuxury Car Replacement Coverage"));

         list.add(new User_Auto_Insurance("Low-Cost Auto Insurance", "Affordable coverage for budget-conscious individuals.", "165/month", "3 months",
                 "Bodily Injury Liability: $15,000 per person / $30,000 per accident\nProperty Damage Liability: $10,000 per accident"));

         myAdapter = new MyAdapter_AutoInsurance(this, list);
         recyclerView.setAdapter(myAdapter);
     }

 }
