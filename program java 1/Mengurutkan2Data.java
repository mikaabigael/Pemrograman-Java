import java.util.Scanner;   //Import the Scanner class
public class Mengurutkan2Data {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //deklarasi
         int data1,data2;
         //inputan
         System.out.print("Masukkan nilai 1 :");
         data1 = masukan.nextInt();
         System.out.print("Masukkan nilai 2 :");
         data2 = masukan.nextInt();

         if(data1>data2)
         {System.out.println("Ascending :"+data1+" , "+data2 );} else
         {System.out.println("Ascending  :"+data1+" , " +data2);

        }
    }
}




