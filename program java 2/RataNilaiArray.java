import java.util.Scanner;  // Import the Scanner clas
class RataNilaiArray {
      public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        int i,jml;
		double totalnilai=0,ratanilai;
		System.out.print("Masukan banyak Nilai :");  
		jml = data.nextInt(); data.nextLine();  // Read user input
		int [] nilai = new int[jml+1];
        //input data nilai
		for(i=1;i<=jml;i++)
		{
		 System.out.print("Masukan nilai ke-"+i+":"); 
		 nilai[i] = data.nextInt(); data.nextLine();
		}
		//proses hitung rata nilai
		for(i=1;i<=jml;i++)
		{
		 totalnilai = totalnilai+nilai[i];
		}
		ratanilai=totalnilai/jml;
		//cetak data nilai dan rata nilai
		for(i=1;i<=jml;i++)
		{
		 System.out.println("Nilai ke-"+i+":"+nilai[i]); 
		}
		System.out.println("Rata Nilai:"+ratanilai); 
	  }// end main
    }// end class

    