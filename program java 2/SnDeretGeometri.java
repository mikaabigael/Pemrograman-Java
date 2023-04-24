import java.util.Scanner;   
class SnDeretGeometri {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Crate a Scanner object
         int n;
         double i, a, r, Un=1;
         double hasil=0;
         
        System.out.println("-----------------------------");
        System.out.println("  ");
        System.out.println(" Menghitung Sn deret Geometri");
        System.out.println("  ");

         System.out.print("Masukkan Bilangan awal        :");
         a=masukan.nextInt();
         System.out.print("Masukkan Bilangan rasio       :");
         r=masukan.nextInt(); 
         System.out.print("Masukkan banyak bilangan      :");
         n=masukan.nextInt();

         Un=a*Math.pow(r,n-1);

            System.out.println("     ");
            System.out.println(" Suku ke-"+n+" :"+Un);
         
        i=a;
        while (i<=Un)
        {
            hasil=hasil+i;
            i=i*r;
        }

            System.out.println("     ");
            System.out.println("Hasil Deret "+n+" suku pertama geometri : "+hasil);
            System.out.println("     ");
            System.out.println("-----------------------------");    
              
    }
}