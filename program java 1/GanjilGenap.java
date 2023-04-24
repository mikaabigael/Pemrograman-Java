import java.util.Scanner;   //Import the Scanner class
public class GanjilGenap {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //deklarasi
         int bilangan;
         //inputan
         System.out.print("Masukkan bilangan bulat :");
         bilangan=masukan.nextInt();

         if(bilangan<0){
             System.out.println(+bilangan+" merupakan Bilangan Negatif");}
             else {
            if(bilangan%2==0){
             System.out.println(+bilangan+" merupakan Bilangan Genap ");}
             else {
             System.out.println(+bilangan+" merupakan Bilangan Ganjil");}
            
        }}
    }
