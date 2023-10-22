package com.example.myapplication;

public class User_Education_Loan {
    private String Bank_Name;
    private String Loan_Description;
    private String Loan_Term;
    private String Loan_amount;
    private String Loan_intrest;

    public User_Education_Loan(String bank_Name, String loan_Description, String loan_Term, String loan_amount, String loan_intrest) {
        Bank_Name = bank_Name;
        Loan_Description = loan_Description;
        Loan_Term = loan_Term;
        Loan_amount = loan_amount;
        Loan_intrest = loan_intrest;
    }

    public String getBank_Name() {
        return Bank_Name;
    }

    public String getLoan_Description() {
        return Loan_Description;
    }

    public String getLoan_Term() {
        return Loan_Term;
    }

    public String getLoan_amount() {
        return Loan_amount;
    }

    public String getLoan_intrest() {
        return Loan_intrest;
    }
}
