package Polymorfisme;

class KueJadi extends Kue{ // Subclass kue jadi
    double jumlah; // Field jumlah

    public KueJadi(String nama, double harga, double jumlah){ // Constructor untuk inisialisasi nama, harga, dan jumlah
        super(nama, harga);
        this.jumlah = jumlah;
        this.harga = hitungHarga();
    }

    @Override
    double hitungHarga(){ // Override menghitung harga kue jadi 
        return harga * jumlah * 2;
    }

    @Override
    String getJenisKue(){ // Override menampilkan jenis kue jadi
        return "Kue Jadi";
    }
}