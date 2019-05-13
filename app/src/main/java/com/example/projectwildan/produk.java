package com.example.projectwildan;

public class produk {

    String produkid;
    String produkName;
    Integer produkHarga;

    public produk(){

    }
    public produk(String produkid, String produkName, Integer produkHarga){
        this.produkid = produkid;
        this.produkName = produkName;
        this.produkHarga = produkHarga;

    }

    public String getProdukid() {
        return produkid;
    }

    public String getProdukName() {
        return produkName;
    }

    public Integer getProdukHarga() {
        return produkHarga;
    }
}
