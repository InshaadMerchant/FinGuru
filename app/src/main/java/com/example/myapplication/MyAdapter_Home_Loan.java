package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_Home_Loan extends RecyclerView.Adapter<MyAdapter_Home_Loan.MyViewHolder> {
    Context context;

    ArrayList<User_Home_Loan> list;


    public MyAdapter_Home_Loan(Context context, ArrayList<User_Home_Loan> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_home_loan,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User_Home_Loan user = list.get(position);
        holder.Bank.setText(user.getBank_Name());
        holder.Loan_Description.setText(user.getLoan_Description());
        holder.LoanTerm.setText(user.getLoan_Term());
        holder.LoanAmount.setText(user.getLoan_amount());
        holder.LoanInterest.setText(user.getLoan_intrest());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Bank,Loan_Description,LoanTerm,LoanAmount,LoanInterest;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Bank = itemView.findViewById(R.id.tvBank_Name_Home);
            Loan_Description = itemView.findViewById(R.id.tvLoan_Description_Home);
            LoanTerm = itemView.findViewById(R.id.tvLoanTerm_Home);
            LoanAmount = itemView.findViewById(R.id.tvLoanAmount_Home);
            LoanInterest= itemView.findViewById(R.id.tvLoanintrest_Home);

        }
    }

}