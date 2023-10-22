package com.example.myapplication;

import com.google.android.material.textfield.TextInputEditText;

public class HelperClass_AutoInsurance {
    int vin_number , year, driver_license, down_payment, Monthly_Payment;
    String make, model;

    public HelperClass_AutoInsurance(int vin_number, int year, int driver_license, int down_payment, int monthly_Payment, String make, String model) {
        this.vin_number = vin_number;
        this.year = year;
        this.driver_license = driver_license;
        this.down_payment = down_payment;
        Monthly_Payment = monthly_Payment;
        this.make = make;
        this.model = model;
    }

    public HelperClass_AutoInsurance() {
    }

    public int getVin_number() {
        return vin_number;
    }

    public void setVin_number(int vin_number) {
        this.vin_number = vin_number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(int driver_license) {
        this.driver_license = driver_license;
    }

    public int getDown_payment() {
        return down_payment;
    }

    public void setDown_payment(int down_payment) {
        this.down_payment = down_payment;
    }

    public int getMonthly_Payment() {
        return Monthly_Payment;
    }

    public void setMonthly_Payment(int monthly_Payment) {
        Monthly_Payment = monthly_Payment;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
