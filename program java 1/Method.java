import java.util.Scanner; //Import the Scanner class
class Method {
    public static void main(String[]abc){
        Scanner masukan = new Scanner (System.in); //Create a Scanner object
		String nama; 
		int umur, pensiun;
		System.out.print(" Inputkan Nama Anda	:");
		nama = masukan.nextLine(); //Read user input
		System.out.print(" Inputkan Umur Anda	:");
		umur = masukan.nextInt();	masukan.nextLine();
		cetakID (nama, umur);
		System.out.println(" anda pensiun "+hitungPensiun(umur)+" tahun lagi");
	
	} //end main
	
	public static int hitungPensiun	(int usia) 
	//method dengan parameter & return int 
	{
		int pensiun = 67-usia;
		return pensiun;
	}
	
	
	public static void cetakID (String nama, int usia)
	//method dengan parameter & void (tanpa return)
	{
		garis ();
		System.out.println(" nama Anda	:"+nama);
		System.out.println(" umur Anda	:"+usia);
		garis ();
	}
	
	
	public static void garis() 
	{
		System.out.println("--------------------------");
	} //end method garis
	
	
} //end class