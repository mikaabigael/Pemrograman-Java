import java.util.Scanner; //Import the Scanner class
class Rata3BilanganBulat {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        int a,b,c,jumlah;
        double rata;

        //inputan
        System.out.print("Masukan bil bulat 1 :");
        a = masukan.nextInt(); masukan.nextLine(); 
        System.out.print("Masukan bil bulat 2 :");
        b = masukan.nextInt(); masukan.nextLine(); 
        System.out.print("Masukan bil bulat 3 :");
        c = masukan.nextInt(); masukan.nextLine(); 
       
        //perhitungan
        jumlah=a+b+c;
        rata=(double)jumlah/3;
        
        //output
        System.out.println("Rata-rata dari 3 data  : "+rata);
       
	}
}