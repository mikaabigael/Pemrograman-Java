import java.util.Scanner;   //Import the Scanner class
class PercabanganSwitch {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //bagian deklarasi
         char pilih;
         int harga=0;
         //bagian input
         System.out.println(" Menu Pilihan  :");
         System.out.println(" 1. Bakso      :10000");
         System.out.println(" 2. Mie Ayam   :7000");
         System.out.println(" 3. Soto       :5000");
         System.out.print(" Masukan Pilihan Anda  :");
         pilih = masukan.next().charAt(0);  masukan.nextLine(); //Read user input
         switch(pilih)
         {
             case '1': System.out.println("Pilih Bakso "); 
                     harga=10000; break;
             case '2': System.out.println("Pilih Mie Ayam "); 
                     harga=7000; break;
             case '3': System.out.println("Pilih Soto "); 
                     harga=5000; break;
            default: System.out.println("Tidak Memilih "); 
                    
         }
         System.out.println("Harga Menu :"+harga);
    }  
}   