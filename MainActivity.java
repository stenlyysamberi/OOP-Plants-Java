package com.example.goprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.goprint.Adapter.Produk;
import com.example.goprint.Class.Barang_Detil;
import com.example.goprint.Interface.Keranjang;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Barang_Detil bg = new Barang_Detil(); //instanace of class Barang Detail


        recyclerView = findViewById(R.id.recy_produk);
        Produk ad = new Produk(this,bg.getNama(),bg.getImg(),bg.getHarga(),bg.getCategory(),bg.getSize(),bg.getType(),bg.getPlace(),bg.getPot(),bg.getLayer(),bg.getTinggi(),bg.getDemensi());
        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.VERTICAL,false));



    }
}