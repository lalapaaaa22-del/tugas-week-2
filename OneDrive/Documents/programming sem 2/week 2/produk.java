public class produk package base;
public class Produk {
    //Atribut
    public String nama;
    public String kategori;
    public double harga;
    public int stok;

    //Constructor
    public Produk(String nama, String kategori, double harga, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    } {
    
}
public void tampilkanInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}