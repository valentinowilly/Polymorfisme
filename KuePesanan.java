package Polymorfisme;

class KuePesanan extends Kue{ // Subclass kue pesanan
    double berat; // Field berat

    public KuePesanan(String nama, double harga, double berat){ // Constructor untuk  inisialisasi nama, harga, berat
        super(nama, harga);
        this.berat = berat;
        this.harga = hitungHarga();
    }

    @Override
    double hitungHarga(){ // Override menghitung harga kue pesanan
        return harga * berat;
    }

    @Override
    String getJenisKue(){ // Override menampilkan jenis kue pesanan
        return "Kue Pesanan";
    }
}