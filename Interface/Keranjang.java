package com.example.goprint.Interface;

import android.util.Log;
import android.widget.Toast;

import com.example.goprint.Class.ConvertRp;

public class Keranjang implements Belanja{
    private int jumlah;
    private int total;
    private int harga;

    public  Keranjang(){
        this.jumlah =0;
    }

    public int getJumlah() {
        return jumlah;
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

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void beli() {
        if (this.jumlah >= MAX_ORDER){
            Log.e("Max Order", String.valueOf(MAX_ORDER));
        }else if(this.jumlah <= min_ORDER){
            Log.e("Min Order", String.valueOf(min_ORDER));
        }
    }

    public void total(int harga, int jumlah){
        ConvertRp rp = new ConvertRp();
        this.harga = harga;
        this.jumlah = jumlah;

        total = jumlah*harga;

        Log.e("total", String.valueOf(rp.toRupiah(total)));
    }

    public void total(){

    }


}
