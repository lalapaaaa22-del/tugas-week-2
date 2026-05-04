 import java.util.Scanner;

public class aplikasilayanankendaraan {

    Scanner scanner = new Scanner (System.in);
    String merek,statusServis,jenisKendaraan;
    int nomorPolisi, tahunProduksi,jumlahPintu;

}
    // buatkan aplikasli sederhana layanan kendaraqan dalam aplikasli 
    //setiap kendaraan data umum nomor polisi , merek tahunoridksi , jumlahpintustatus servis  dengan jenis kendaraan yang dilayani mobil dan motor . mobil ada data tambahan jumlahpintu dan tipe transmisi. motor punya jenismesin dan kapasitas tangki.
    //untuk keamanan data  atribut kendaraan tidak boleh diakes secara langsung di luar class.
    //perubahan data statusservis harusu melalui method tertentu agar nilaina valid. dan hanya boleh bernilai "Menunggu", " Diproses" , "selesai" selain itu ketik objek kendaraan dibuat data awal seperti nomor [polisi, merek dan tahun prosuksi harus langsung diisi agar objek tidak berada dalam kondisi kosong atau tidak valid dan aplikasli harus menghindari penulisan ulang atribut dan method yg sta oada method class mpobil motor : rancang analisis oop 
    //1. tentukan class apa saja yg dibutuhkan dan jelaskan alasan pemilihannya
    //2.identifikasi TRIBUT Dan method yg ditampilkan di class induk dan turunan
    //3.bagaimana constructor digunakan agar objek kendaraan selelu memiliki data awal yg valid
    //4. analisi bagaimana enkapulasi ditetapkan untuk melindungi data kendaraan khususnya pada  atribut data servis 
    //5.
}
//1. tentukan class apa saja yg dibutuhkan dan jelaskan alasan pemilihannya
jawaban : ada class produk, ada sub class mobil dan motor . lalu ada class 
          class pemasukan untuk sebagai tanda terima untuk data catatan layanan kendaraan 
          class main ada untuk produknya 
    
//2.identifikasi atribut Dan method yg ditampilkan di class induk dan turunan
jawaban : ada total pemasukkan, ada penentuan jenis kendaraan, pengisian jawaban yang data umum yang perlu diisi
            dengan methodnya adalah pemasukan, produk,mobil, motor dan kasir

//3.bagaimana constructor digunakan agar objek kendaraan selelu memiliki data awal yg valid
jawaban: objek harus ada di dalam class dan harus ada yang memanggil objek sebagai proses dari return atau mengembalikan 

//4. analisi bagaimana enkapulasi ditetapkan untuk melindungi data kendaraan khususnya pada  atribut data servis 
    enkapulasi ditetapkan dengan cara penentuan dari objeknya dan di buat bentuk private bukan publik agar data servis tetap aman dan tidak dicampuri

//5. jelaskan mengapa inheritance dapat digunakan pada kasus ini serta alasannya  lebih cocok menjadi sub class dibandingkan membuat class mobil dan motor secara terpisah
karna ada class induk dan turunan dimana class turunan adalah bukti fungsi dari inheritance yaitu menurunkan sehingga kasus ini lebih cocok menggunakan subclass dari pada membeuat class mobil dan motor secara langsung 

//6. berikan minimal 1 contoh objek nyata dari class mobil dan motor lalu jelaskan nilai atribur yang dimiliki objek tersebut 
jawaban : objek ada karna proses return contohnya dan merupakan nilai yang  ingin dicari contohnya
jumlah pertemuan dalam data layanan kendaraan untuk mengetahui perkembangan dari servis atau menentukan status servis kendaraan 