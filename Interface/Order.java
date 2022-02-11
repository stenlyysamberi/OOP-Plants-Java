package com.example.goprint.Interface;

import com.example.goprint.Class.Barang;

public class Order {

    private Belanja belanja;

    public Order(Belanja belanja) {
        this.belanja = belanja;

    }

    public void beli(){
        this.belanja.beli();
    }


}
