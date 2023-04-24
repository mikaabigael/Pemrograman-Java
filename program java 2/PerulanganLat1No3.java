import java.util.Scanner;   
class PerulanganLat1No3 {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
        
        //bagian deklarasi
        int i, bil, jumlah=0;
        
        //input data
        System.out.print("Masukkan banyak Bilangan Asli    :");
        bil=masukan.nextInt();  masukan.nextLine();
        
        //perintah for
            for (i=1; i<=bil; i++)
            {jumlah=jumlah+i;}
        
        //cetak hasil
        System.out.println("Hasil Penjumlahan "+bil+" bilangan asli pertama adalah "+jumlah);
     }
}