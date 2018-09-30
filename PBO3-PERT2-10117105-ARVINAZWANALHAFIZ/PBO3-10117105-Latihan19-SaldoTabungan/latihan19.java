//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3
//

/**
 *
 * @author RIA FITRIANI
 */
public class latihan19 {
  public static void main(String[] args) {
        
//        deklarasi variabel
        int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int lamaBulan;
        
//        variabel yang diberi value
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
//        proses looping selama 6x
        for (int i = 1; i <= lamaBulan; i++) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            //menampilkan dengan format tertentu
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
    }
    
}
