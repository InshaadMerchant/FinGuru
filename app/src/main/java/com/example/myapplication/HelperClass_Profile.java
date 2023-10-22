package com.example.myapplication;

public class HelperClass_Profile {
    int Age, Monthly_Income, Monthly_saving, Gross_Loan_Installment, Credit_score;
    String Occupation;

    public HelperClass_Profile(int age, int monthly_Income, int monthly_saving, int gross_Loan_Installment, int credit_score, String occupation) {
        Age = age;
        Monthly_Income = monthly_Income;
        Monthly_saving = monthly_saving;
        Gross_Loan_Installment = gross_Loan_Installment;
        Credit_score = credit_score;
        Occupation = occupation;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getMonthly_Income() {
        return Monthly_Income;
    }

    public void setMonthly_Income(int monthly_Income) {
        Monthly_Income = monthly_Income;
    }

    public int getMonthly_saving() {
        return Monthly_saving;
    }

    public void setMonthly_saving(int monthly_saving) {
        Monthly_saving = monthly_saving;
    }

    public int getGross_Loan_Installment() {
        return Gross_Loan_Installment;
    }

    public void setGross_Loan_Installment(int gross_Loan_Installment) {
        Gross_Loan_Installment = gross_Loan_Installment;
    }

    public int getCredit_score() {
        return Credit_score;
    }

    public void setCredit_score(int credit_score) {
        Credit_score = credit_score;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public HelperClass_Profile() {
    }
}
