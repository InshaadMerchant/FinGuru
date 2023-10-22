package com.example.myapplication;

public class User_Home_Loan {
    private String bank_Name;
    private String loan_Description;
    private String loan_Term;
    private String loan_amount;
    private String loan_intrest;

    public User_Home_Loan(String bank_Name, String loan_Description, String loan_Term, String loan_amount, String loan_intrest) {
        this.bank_Name = bank_Name;
        this.loan_Description = loan_Description;
        this.loan_Term = loan_Term;
        this.loan_amount = loan_amount;
        this.loan_intrest = loan_intrest;
    }

    public String getBank_Name() {
        return bank_Name;
    }

    public String getLoan_Description() {
        return loan_Description;
    }

    public String getLoan_Term() {
        return loan_Term;
    }

    public String getLoan_amount() {
        return loan_amount;
    }

    public String getLoan_intrest() {
        return loan_intrest;
    }
}
