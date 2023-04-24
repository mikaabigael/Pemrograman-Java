import java.util.Scanner; //Import the Scanner class
class MencariAbsolutMethod {
	public static void main(String[]abc){
		kosong();
		garis();
		System.out.println("| Mencari Nilai Absolute  |");
        garis();
		kosong();
		Scanner masukan = new Scanner (System.in); //Create a Scanner object
		System.out.print(" Masukkan Nilai 	:");
		int nilai = masukan.nextInt();
		kosong();
		garis();
		System.out.println(" Nilai Absolutenya adalah	: "+Math.abs(nilai));
		garis();
		kosong();
	}
	
	public static void garis() 
	{
		System.out.println("--------------------------");
	}
	
	public static void kosong() 
	{
		System.out.println(" ");
	}
}