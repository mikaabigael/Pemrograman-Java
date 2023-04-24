import java.util.Scanner; //Import the Scanner clas
class XpangkatYWhile {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int x, y, i=1 ;
        int hasil=1;
    
        System.out.println("--------------------------------------");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println(" Menghitung Hasil Pangkat Bilangan");
        System.out.println("  ");
        System.out.println(" |Format (x^y)|");
        System.out.println(" |x = angka   |");
        System.out.println(" |y = pangkat |");
        System.out.println("  ");
            
            System.out.print(" masukkan angka   = ");
            x=masukan.nextInt();
            System.out.print(" masukkan pangkat = ");
            y=masukan.nextInt();

        while (i<=y)
        {
            hasil=hasil*x;
            i=i+1;
        }

            System.out.println("        ");
            System.out.println("            hasil = "+hasil);
            System.out.println("        ");
            System.out.println("        ");
            System.out.println("------------------------------------");
            
    }
}