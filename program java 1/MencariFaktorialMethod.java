import java.util.Scanner; //Import the Scanner class
class MencariFaktorialMethod {
	public static int Faktorial(int a){
		int hasil=1;		
		for (int i=a; i>0; i--) 
		{
			hasil*=i;
		}
		return hasil;
	}
	public static void main (String[] args) {
		kosong();
		garis ();
		System.out.println(" Menentukan Faktorial (n!)");
		garis ();
		kosong ();
		Scanner masukan = new Scanner(System.in);
		System.out.print(" Masukkan angka :");
		int angka = masukan.nextInt ();
		kosong ();
		System.out.println(" "+angka+"! adalah "+Faktorial(angka));
		kosong ();
		garis ();
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
	
