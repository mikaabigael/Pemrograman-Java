import java.util.Scanner;   
class PerulanganLat1No6 {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
         int a, b, n, i=0, jumlah=0;
         
         System.out.print("Masukkan banyak bilangan     :");
         n=masukan.nextInt();
         System.out.print("Masukkan Bilangan awal       :");
         a=masukan.nextInt();
         System.out.print("Masukkan Bilangan beda       :");
         b=masukan.nextInt(); 

            System.out.println("     ");
            System.out.println("Deret aritmatika   :");
         
            for(i=a; i<=n; i+=b)
            {
             System.out.print(+i+"  ");
             jumlah+=i;
             }

            System.out.println("     ");
            System.out.println("Hasil Penjumlahan deret aritmatika   : "+jumlah);      
    }
}
