package com.example.goprint.Class;

import android.util.Log;

    public class Credit extends Payment{
        protected int number;
        protected String nama;
        protected double jumlahBayar;
        protected double expDate;


        @Override
        public void auth(){
            Log.e("error","Oke");
            //System.out.println("Jumlah Bayar" + super.jumlahBayar );
            //Log.e("SubTotal", String.valueOf(super.jumlahBayar));
        }
    }
