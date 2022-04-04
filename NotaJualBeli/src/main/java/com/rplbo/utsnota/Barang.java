package com.rplbo.utsnota;

public class Barang {
    private String deskripsi;
    private String kodebarang;
    private int harga;
    private int berat;

    public Barang(String deskripsi,int kodebarang, int harga, String berat){
        this.deskripsi = deskripsi;
        this.kodebarang = kodebarang;
        this.harga = harga;
        this.berat = berat;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(){
        this.harga = harga;
    }

    public int getBerat(){
        return berat;
    }

    public void setBerat(int berat){
        this.berat = berat;
    }

    public String getKodebarang(){
        return kodebarang;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void getInformasi(){}

    public void setKodebarang(String kodebarang){
        this.kodebarang = kodebarang;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
}
