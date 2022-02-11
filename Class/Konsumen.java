package com.example.goprint.Class;

    public class Konsumen {

        private int id_konsumen;
        private String nama;
        private String alamat;
        private String tlpn;

        public Konsumen(int id_konsumen, String nama, String alamat, String tlpn) {
            this.id_konsumen = id_konsumen;
            this.nama = nama;
            this.alamat = alamat;
            this.tlpn = tlpn;
        }

        public int getId_konsumen() {
            return id_konsumen;
        }

        public void setId_konsumen(int id_konsumen) {
            this.id_konsumen = id_konsumen;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getTlpn() {
            return tlpn;
        }

        public void setTlpn(String tlpn) {
            this.tlpn = tlpn;
        }
    }
