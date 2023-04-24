import java.util.Scanner;   
class PerulanganLat1No1 {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
         
         // bagian deklarasi
         int i,a,b,kecil,besar;
         System.out.print("Bilangan bulat pertama  :");
         a=masukan.nextInt();   masukan.nextLine();
         System.out.print("Bilangan bulat kedua    :");
         b=masukan.nextInt();   masukan.nextLine();

         // perinatah If menentukan bilangan besar dan kecil 
         if (a>b)   {besar=a;   kecil=b;} 
         else {besar=b; kecil=a;}

         //perintah for untuk mencetak dari kecil ke besar
            for (i=kecil; i<=besar; i++)
            { System.out.print(i+"  ");}
     }
}