package com.sk.i2i.smsapp.model;

public class UserInfo {
    private long id;
    private int dk;
    private int sms;
    private double anInt;
    private String ad;
    private String soyad;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDk() {
        return dk;
    }

    public void setDk(int dk) {
        this.dk = dk;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public double getInt() {
        return anInt;
    }

    public void setInt(double anInt) {
        this.anInt = anInt;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
