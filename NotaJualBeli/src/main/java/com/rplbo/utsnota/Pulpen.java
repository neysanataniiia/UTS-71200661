package com.rplbo.utsnota;

public class Pulpen extends Barang{
    default String warna;

    public Pulpen(String kodebarang, int harga, int berat, String deskripsi, String warna) {}

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna= warna;
    }

    public void getInformasi(){
        super.getInformasi();
    }
}
