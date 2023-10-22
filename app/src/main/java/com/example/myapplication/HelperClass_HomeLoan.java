package com.example.myapplication;

public class HelperClass_HomeLoan {
    String Area_of_property;
    int annual_income, current_value_of_property, zipcode, realtor_license, phone_no;

    public HelperClass_HomeLoan(String area_of_property, int annual_income, int current_value_of_property, int zipcode, int realtor_license, int phone_no) {
        Area_of_property = area_of_property;
        this.annual_income = annual_income;
        this.current_value_of_property = current_value_of_property;
        this.zipcode = zipcode;
        this.realtor_license = realtor_license;
        this.phone_no = phone_no;
    }

    public HelperClass_HomeLoan() {
    }

    public String getArea_of_property() {
        return Area_of_property;
    }

    public void setArea_of_property(String area_of_property) {
        Area_of_property = area_of_property;
    }

    public int getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(int annual_income) {
        this.annual_income = annual_income;
    }

    public int getCurrent_value_of_property() {
        return current_value_of_property;
    }

    public void setCurrent_value_of_property(int current_value_of_property) {
        this.current_value_of_property = current_value_of_property;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getRealtor_license() {
        return realtor_license;
    }

    public void setRealtor_license(int realtor_license) {
        this.realtor_license = realtor_license;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }
}
