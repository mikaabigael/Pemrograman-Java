import java.util.Scanner;   
class PerulanganLat1No7 {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
         //deklarasi
         int i, bil, bilInput,  kali=1;

         //input data
         System.out.print("Masukkan banyak Bilangan    :");
         bil=masukan.nextInt();  
         
         //perintah for
         for(i=1;i<=bil;i++)
         {System.out.print("Bilangan ke-"+i+" = ");
         bilInput=masukan.nextInt();   
         kali*= bilInput; }

         //cetak hasil
         System.out.println("Hasil perkalian semua bilangan = "+kali);
         
 
    }
}