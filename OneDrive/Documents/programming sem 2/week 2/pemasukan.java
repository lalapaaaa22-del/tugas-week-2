public class pemasukan package toko;

import base.Produk; // import class Produk dari package elektronik

//package: elektronik (berbeda) - subclass dari produk
class Pemasukan extends Produk {
    //Produk deve essere definito nella stesso package o importato
    public double totalPemasukan;

    public Pemasukan(String nama, String kategori, double harga, int stok) {
        super(nama, kategori, harga, stok);
        this.totalPemasukan = 0;

    }
    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga; // protected
            stok -= jumlah; // public - boleh
        } else { {
    
}
System.out.println("Stok tidak cukup!");
        }
    }
}