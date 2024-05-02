package Polymorfisme;

abstract class Kue{ // Abstract class Kue 
    String nama; // Field nama dan harga
    double harga;   

    public Kue(String nama, double harga){ // Constructor untuk inisialisasi nama dan harga
        this.nama = nama;
        this.harga= harga;
    }

    abstract double hitungHarga(); // Method abstrak untuk menghitung harga kue

    @Override // Override method toString untuk menampilkan informasi Kue
    public String toString(){ 
        return "Nama Kue\t: " + nama + "\nHarga\t\t: Rp " + String.format("%.2f", harga) + "\nJenis Kue\t: " + getJenisKue();
    }
    abstract String getJenisKue(); // Mendapatkan jenis kue
}