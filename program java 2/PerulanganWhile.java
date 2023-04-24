import java.util.Scanner; //Import the Scanner clas
class PerulanganWhile {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int i, jmlulang, U;
        System.out.print("Inputkan jumlah perulangan :");
        jmlulang = masukan.nextInt();   masukan.nextLine();
        
        //perintah While
        i=1; //nilai awal
        while(i<=jmlulang)//kondisi
        {
            System.out.println("Cetak Kata Ke-"+i); //badan perulangan
            i++; //terminasi
        }
        
        //deret n bilangan ganjil pertama
        i=1; //nilai awal
        while(i<=jmlulang) //kondisi
        {
            U=2*i-1;
            System.out.println(U+" "); //badan perulangan
            i++; //terminasi
        }
    }
}