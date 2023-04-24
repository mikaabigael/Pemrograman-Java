import java.util.Scanner; //Import the Scanner class
class VariabelInput {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        int x; //deklarasi 
        int y;
        int jumlah,kurang,kali; //deklarasi saja (tipe bil bulat)
        double bagi; //deklarasi saja (tipe bil desimal)
        String mapel;
        int sisahasilbagi; //modulo
        
        System.out.print("Masukan nama mata pelajaran  :");
        mapel = masukan.nextLine(); // Read user input String
        System.out.print("Masukan nilai x :");
        x = masukan.nextInt(); masukan.nextLine(); //Red user input integer
        System.out.print("Masukan nilai y :");
        y = masukan.nextInt(); masukan.nextLine(); //Red user input integer

        jumlah=x+y; //inisialisasi jumlah dengan Proses hitung
        kurang=x-y;
        kali=x*y;
        bagi=(double)x/y;
        sisahasilbagi=x%y;

        System.out.println("mata pelajaran      :   "+mapel);
		System.out.println("hasil penjumlahan   :   "+jumlah);
        System.out.println("hasil penjumlahan   :   "+(x+y));
        System.out.println("hasil penjumlahan   :   "+x+" + "+y+" = "+jumlah);
	    System.out.println("hasil penguranganan :   "+kurang);
        System.out.println("hasil perkalian     :   "+kali);
        System.out.println("hasil pembagian     :   "+bagi);
        System.out.println("hasil sisa pembagian:   "+sisahasilbagi);
        

	}
}