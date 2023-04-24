import java.util.Scanner; //Import the Scanner class
class HitungTotalBayar {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        double jumlahbarangA, jumlahbarangB, hargabarang, A, B;

        //inputan
        System.out.print(" Jumlah barang A:");
         jumlahbarangA= masukan.nextInt(); masukan.nextLine(); 
        System.out.print(" Jumlah barang B:");
         jumlahbarangB= masukan.nextInt(); masukan.nextLine(); 
        
        //proses
        A = (double)(100-10)/100 * 1000;
        B = (double)(100-5)/100 * 2000;
        hargabarang = A*jumlahbarangA + B*jumlahbarangB;
       
        //output
        System.out.println("Total Harga Bayar  : "+hargabarang);
        
	}
}