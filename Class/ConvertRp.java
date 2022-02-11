package com.example.goprint.Class;

import java.text.NumberFormat;
import java.util.Locale;

public class ConvertRp {

    public String toRupiah(int number){
        Locale id = new Locale("in", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(id);
        return format.format(number);
    }

}
