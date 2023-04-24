import java.util.Scanner;   //Import the Scanner class
class HitungDiskon {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //bagian deklarasi
         double totalbelanja,diskon,totaldiskon,bayarsetelahdiskon;
         //bagian input
         System.out.print("Inputkan Total Belanja Anda :");
         totalbelanja = masukan.nextDouble(); masukan.nextLine(); // Read user input
         //bagian hitung
            if(totalbelanja>=100000){diskon=10;} else
            if(totalbelanja>=50000){diskon=5;} else
            {diskon=0;}
            totaldiskon=diskon/100*totalbelanja;
            bayarsetelahdiskon=totalbelanja-totaldiskon;
         //bagian cetak hasil
            System.out.println("Anda dapat diskon       :"+diskon+" % ");
            System.out.println("Total diskon            :"+totaldiskon);
            System.out.println("Harga bayar setelah diskon    :"+bayarsetelahdiskon);

     }
}