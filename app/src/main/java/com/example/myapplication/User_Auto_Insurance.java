package com.example.myapplication;

public class User_Auto_Insurance {
    private String Policy_Name;
    private String Policy_Description;
    private String Price;
    private String Term;
    private String Coverage;

    public User_Auto_Insurance(String policyName, String policyDescription, String price, String term, String coverage) {
        this.Policy_Name = policyName;
        this.Policy_Description = policyDescription;
        this.Price = price;
        this.Term = term;
        this.Coverage = coverage;
    }

    public String getPolicy_Name() {
        return Policy_Name;
    }

    public String getPolicy_Description() {
        return Policy_Description;
    }

    public String getPrice() {
        return Price;
    }

    public String getTerm() {
        return Term;
    }

    public String getCoverage() {
        return Coverage;
    }
}
