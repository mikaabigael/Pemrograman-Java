import java.util.Scanner; //Import the Scanner clas
class MenghitungFPB {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        int a, b , c ;
    
        System.out.print("---------------------------");
        System.out.println("  ");
        System.out.println(" Menghitung FPB dari 2 Bilangan ");
        System.out.println("  ");

        System.out.print(" Masukkan Bilangan Pertama     : ");
        a = masukan.nextInt();
        System.out.print(" Masukkan Bilangan Kedua       : ");
        b= masukan.nextInt();
   
            c= a%b ;
            while (c!=0)
            {
                a=b;
                b=c;
                c= a%b;
            }
        
        System.out.println(" ");
        System.out.println ("       FPB= "+b);
        System.out.println(" ");
        System.out.print("---------------------------");
    }

}