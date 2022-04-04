package com.rplbo.utsnota;

import javax.security.auth.kerberos.KerberosTicket;

public class KertasHVS extends Barang{
    private int gram;

    public KertasHVS(String kodebarang, int harga, int berat, String deskripsi, int gram) {
        super(kodebarang,harga,berat,deskripsi,gram);
    }


    public void setGram(int gram){
        this.gram = gram;
    }

    public void getInformasi(){
        super.getInformasi();
    }

    public int getGram(){
        return this.gram;
    }
}
