import java.util.Scanner; //Import the Scanner class
class Maksimal3DataMethod {
    public static void main(String[]abc){
        Scanner masukan = new Scanner (System.in); //Create a Scanner object
		int A,B,C,maksimal;
         garis2 ();
		 kosong ();
		 garis ();
         System.out.println(" Mencari Nilai Maksimum ");
		 garis ();
		 kosong ();
		 System.out.print("Masukkan bilangan pertama      	:");
         A=masukan.nextInt();
         System.out.print("Masukkan bilangan kedua      	:");
         B=masukan.nextInt();
         System.out.print("Masukkan bilangan ketiga     	:");
         C=masukan.nextInt();
		 kosong ();
		 garis ();

			if (A>B && A>C )
			{maksimal=A;} else 
			{
				if(B>C)
				{maksimal=B;} else {
				maksimal=C;    
				}
			}      
			System.out.println("Bilangan maksimal ="+maksimal);
			garis();
			kosong();
			garis2 ();
			}
		
	
		public static void garis() 
		{
		System.out.println("--------------------------");
		} 
		public static void garis2() 
		{
			System.out.println("==========================");
		} 
		public static void kosong() 
		{
			System.out.println(" ");
		} 
	} 
