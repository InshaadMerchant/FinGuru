package com.example.myapplication;

public class HelperClass_EducationLoan {
    String institution, guaranteer_name;
    int sat, sevis, fed_aid, guaranteer_income, current_scholarship;

    public HelperClass_EducationLoan(String institution, String guaranteer_name, int sat, int sevis, int fed_aid, int guaranteer_income, int current_scholarship) {
        this.institution = institution;
        this.guaranteer_name = guaranteer_name;
        this.sat = sat;
        this.sevis = sevis;
        this.fed_aid = fed_aid;
        this.guaranteer_income = guaranteer_income;
        this.current_scholarship = current_scholarship;
    }

    public HelperClass_EducationLoan() {
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getGuaranteer_name() {
        return guaranteer_name;
    }

    public void setGuaranteer_name(String guaranteer_name) {
        this.guaranteer_name = guaranteer_name;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getSevis() {
        return sevis;
    }

    public void setSevis(int sevis) {
        this.sevis = sevis;
    }

    public int getFed_aid() {
        return fed_aid;
    }

    public void setFed_aid(int fed_aid) {
        this.fed_aid = fed_aid;
    }

    public int getGuaranteer_income() {
        return guaranteer_income;
    }

    public void setGuaranteer_income(int guaranteer_income) {
        this.guaranteer_income = guaranteer_income;
    }

    public int getCurrent_scholarship() {
        return current_scholarship;
    }

    public void setCurrent_scholarship(int current_scholarship) {
        this.current_scholarship = current_scholarship;
    }
}
