package com.example.pembelajaranbasabali.kamus;

import androidx.annotation.NonNull;

public class DataKamusBasaBali {
    private String indonesia;
    private String andap;
    private String aso;
    private String asi;

    public String getIndonesia(){
        return indonesia;
    }
    public void setIndonesia(String indonesia){
        this.indonesia = indonesia;
    }
    public String getAndap(){
        return andap;
    }
    public void setAndap(String andap){
        this.andap = andap;
    }
    public String getAso(){
        return aso;
    }
    public void setAso(String aso){
        this.aso = aso;
    }
    public String getAsi(){
        return asi;
    }
    public void setAsi(String asi){
        this.asi = asi;
    }

    @Override
    public String toString() {
        String kamusDat = "Data Kamus: Indonesia = "+indonesia+", Andap = "+andap+", Alus Sor = "+aso+", Alus Singgih = "+asi;
        return kamusDat;
    }
}
