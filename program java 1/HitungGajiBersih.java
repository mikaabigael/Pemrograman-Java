import java.util.Scanner; //Import the Scanner class
class HitungGajiBersih {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        double gajipokok,tunjangan,gajikotor,pajak,gajibersih;

        //inputan
        System.out.print("Masukan gaji pokok :");
        gajipokok = masukan.nextInt(); masukan.nextLine(); 
        
        //proses
        tunjangan = (double)10/100 * gajipokok;
        gajikotor = gajipokok + tunjangan;
        pajak = (double)5/100 * gajikotor;
        gajibersih = gajikotor - pajak;
 
        //output
        System.out.println("Tunjangan   : "+tunjangan);
        System.out.println("Gaji Kotor  : "+gajikotor);
        System.out.println("Pajak       : "+pajak);
        System.out.println("Gaji Bersih : "+gajibersih);
       
	}
}