package com.example.goprint.Class;

public class Barang_Detil extends Barang {
    private String [] category = {"Anggrek","Dahlia","Hortensia","Jacaranda","Tulip","Zephyranthes"};
    private String [] size = {"Small","Medium","Big","Small","Medium","Big"};
    private String [] type = {"Indoor","Outdoor","Indoor","Outdoor","Indoor","Outdoor"};
    private String [] place = {"Indoor Plant","Outdoor Plant","Outdoor Plant","Outdoor Plant","Outdoor Plant","Outdoor Plant"};
    private String [] pot = {"Wood","Plastic","aluminum","Iron","Wood","Plastic"};
    private String [] layer = {"Coating", "Sheet","Coat","Surface","Film","Blanket"};
    private int [] tinggi = {2,4,1,5,6,2};
    private double [] demensi = {2.2,4.1,6.3,1.2,8.1,3.2};

    public String[] getCategory() {
        return category;
    }

    public String[] getSize() {
        return size;
    }

    public String[] getType() {
        return type;
    }

    public String[] getPlace() {
        return place;
    }

    public String[] getPot() {
        return pot;
    }

    public String[] getLayer() {
        return layer;
    }

    public int[] getTinggi() {
        return tinggi;
    }

    public double[] getDemensi() {
        return demensi;
    }
}
