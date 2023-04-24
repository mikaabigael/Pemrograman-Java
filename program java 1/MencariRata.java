import java.util.Scanner; //Import the Scanner class
class MencariRata {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in);
        double nilaimath,nilaialgo,rata; //deklarasi saja (tipe bil desimal)
        int sksmath, sksalgo;
        
        //inputan
        System.out.print("Masukkan nilai Matematika :");
        nilaimath = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukkan nilai Algoritma  :");
        nilaialgo = masukan.nextDouble(); masukan.nextLine();
        
        //perhitungan
        sksmath=2;
        sksalgo=3;
        rata=(nilaimath*sksmath+nilaialgo*sksalgo)/(sksmath+sksalgo);
        
        //out
        System.out.println("Rata-rata  : "+rata);
       
	}
}