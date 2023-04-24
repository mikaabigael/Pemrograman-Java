import java.util.Scanner;   //Import the Scanner class
public class MenentukanMaksimal {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //deklarasi
         int A,B,C,maksimal;
        //inputan
         System.out.print("Masukkan bilangan pertama    :");
         A=masukan.nextInt();
         System.out.print("Masukkan bilangan kedua      :");
         B=masukan.nextInt();
         System.out.print("Masukkan bilangan ketiga     :");
         C=masukan.nextInt();

        if (A>B && A>C )
        {maksimal=A;} else {
        if(B>C)
        {maksimal=B;} else {
        maksimal=C;    
        }
        }      
        
        System.out.println("Bilangan maksimal ="+maksimal);
       
        }
    }
