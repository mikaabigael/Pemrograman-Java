import java.util.Scanner;   
class PerulanganLat1No4 {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
         //deklarasi
         int i, bil, bilInput,  jumlah=0;
         double rata;

         //input data
         System.out.print("Masukkan banyak Bilangan    :");
         bil=masukan.nextInt();  
         
         //perintah for
         for(i=1;i<=bil;i++)
         {System.out.print("Bilangan ke-"+i+" =");
         bilInput=masukan.nextInt();   
         jumlah+=bilInput; }

         //cetak hasil
         System.out.println("Jumlah ke"+i+" bilangan       = "+jumlah);
         rata=jumlah/bil;
         System.out.println("Rata-rata ke"+i+" bilangan    = "+rata);
 
    }
}
        
        