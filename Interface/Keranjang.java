package com.example.goprint.Interface;

import android.util.Log;
import android.widget.Toast;

import com.example.goprint.Class.ConvertRp;

public class Keranjang implements Belanja{
    private int jumlah;
    private boolean limit;
    private int total;
    private int harga;



    public  Keranjang(){
        this.jumlah =0;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public boolean isLimit() {
        return limit;
    }

    @Override
    public void beli() {
        Log.e("jumlan_beli", String.valueOf(getJumlah()));
        if (this.jumlah >= MAX_ORDER){ //lebih besar dari 5
            this.limit = true;
            //Log.e("Max Order", String.valueOf(MAX_ORDER));

        }else { //Lebih kecil dari 1
            this.limit = false;
            //Log.e("Min Order", String.valueOf(min_ORDER));
        }
    }

    public void total(int harga, int jumlah){
        this.harga = harga;
        this.jumlah = jumlah;
        total = jumlah*harga;

    }

    public void total( int subTotal){
        this.total = subTotal;

        ConvertRp convertRp = new ConvertRp();
        convertRp.toRupiah(total);
        Log.e("total", String.valueOf(convertRp.toRupiah(total)));
    }



}
