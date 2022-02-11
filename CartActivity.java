package com.example.goprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.goprint.Class.Barang_Detil;
import com.example.goprint.Class.ConvertRp;
import com.example.goprint.Interface.Keranjang;

public class CartActivity extends AppCompatActivity {

    ConvertRp convertRp;
    TextView harga_satuan,subTotal,beli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bundle extras = getIntent().getExtras();
        int jml_beli  = extras.getInt("beli");
        int harga     = extras.getInt("harga");

        Keranjang cart = new Keranjang();
        cart.total(harga,jml_beli);

        harga_satuan = findViewById(R.id.hrg_prdk);
        harga_satuan.setText(cart.getHarga());

        beli = findViewById(R.id.jml_beli);
        beli.setText(cart.getJumlah());

        subTotal = findViewById(R.id.sub_total);
        subTotal.setText(cart.total());



        cart.total(subTotal);


    }
}