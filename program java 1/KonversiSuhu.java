import java.util.Scanner;   //Import the Scanner class
class KonversiSuhu {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //bagian deklarasi
         char pilih;
         double suhucelcius,suhuhasil;
         String suhupilihan;
         //bagian input
         System.out.print("Input Suhu Celcius     :");
         suhucelcius = masukan.nextDouble(); masukan.nextLine();
         System.out.println(" Konversi Suhu dari Celcius   :");
         System.out.println(" 1. Reamur");
         System.out.println(" 2. Fahrenheit");
         System.out.println(" 3. Kelvin");
         System.out.print(" Masukan Pilihan Anda  :");
         pilih = masukan.next().charAt(0);  masukan.nextLine(); //Read user input
         switch(pilih)
         {
             case '1': System.out.println("Pilih Reamur "); 
                       suhuhasil=(double)4/5*suhucelcius; 
                       suhupilihan="Reamur";
                       break;
             case '2': System.out.println("Pilih Fahrenheit "); 
                       suhuhasil=(double)9/5*suhucelcius+32; 
                       suhupilihan="Fahrenheit";
                       break;
             case '3': System.out.println("Pilih Kelvin "); 
                       suhuhasil=(double)suhucelcius+273; 
                       suhupilihan="Kelvin";
                       break;
            default:   System.out.println("Tidak Memilih "); 
                       suhuhasil=suhucelcius; 
                       suhupilihan="Celcius";
                       break; 
                    
         }
         System.out.println("Hasil Konversi Suhu "+suhucelcius+" celcius adalah "+suhuhasil+" "+suhupilihan);
    }  
}   