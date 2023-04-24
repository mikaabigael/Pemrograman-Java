import java.util.Scanner; //Import the Scanner clas
class FaktorialWhile {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int n, i=1;
        int hasil=1;

        System.out.println("-----------------------");
        System.out.println("        ");
        System.out.println("Menghitung Faktorial");
        System.out.println("        ");
        System.out.print("Bilangan yg ingin difaktorial = ");
        n=masukan.nextInt();

    while (i<=n)
    {
        hasil=hasil*i;
        i=i+1;
    }
        
        System.out.println("         ");
        System.out.println("        "+n+"! = "+hasil);
        System.out.println("         ");
        System.out.println("-----------------------");
    }
}
        