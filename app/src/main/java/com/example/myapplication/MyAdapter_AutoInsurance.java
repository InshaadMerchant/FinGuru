package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_AutoInsurance extends RecyclerView.Adapter<MyAdapter_AutoInsurance.MyViewHolder> {
    Context context;

    ArrayList<User_Auto_Insurance> list;


    public MyAdapter_AutoInsurance(Context context, ArrayList<User_Auto_Insurance> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_auto_insurance,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User_Auto_Insurance user = list.get(position);
        holder.Policy_Name.setText(user.getPolicy_Name());
        holder.policy_description.setText(user.getPolicy_Description());
        holder.term.setText(user.getTerm());
        holder.price.setText(user.getPrice());
        holder.coverage.setText(user.getCoverage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Policy_Name, policy_description, term,coverage,price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Policy_Name = itemView.findViewById(R.id.tvPolicy_Name);
            policy_description = itemView.findViewById(R.id.tvPolicy_Description);
            term = itemView.findViewById(R.id.tvTerm);
            coverage = itemView.findViewById(R.id.tvcoverage);
            price= itemView.findViewById(R.id.tvPrice);

        }
    }

}