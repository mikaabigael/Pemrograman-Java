import java.util.Scanner; //Import the Scanner class
class LuasKelilingLingkaran {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        double jari,keliling,luas; //deklarasi saja (tipe bil desimal)
        final double phi=3.14; //final konstanta

        //inputan
        System.out.print("Masukan jari-jari :");
        jari = masukan.nextDouble(); masukan.nextLine(); //Input double jari-jari
       
        //perhitungan
        keliling=2*phi*jari;
        luas=phi*jari*jari;
        luas=phi*Math.pow(jari,2); //untuk Math.pow(r,2)=r^2, Math.sqrt(n) =akar pangkat 2 dari n
        //cetak hasil
        System.out.println("Keliling Lingkaran  : "+keliling);
        System.out.println("Luas Lingkaran      : "+luas);
    
	}
}