public class Main package: berbeda, bukan subclass - class Main

import base.Produk; // import class Produk dari package elektronik

public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", "Elektronik", 3500, 100);

        System.out.println(p.stok); // public - boleh
        System.out.println(p.harga); // ERROR - protected, bukan subclass
        System.out.println(p.kategori); // ERROR - default, beda package
        System.out.println(p.nama); // ERROR - private

        p.tampilkanInfo();//public method - boleh
    }
} {
    
}
