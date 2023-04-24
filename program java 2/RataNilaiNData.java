import java.util.Scanner;  // Import the Scanner clas
class RataNilaiNData{
      public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        int i,jml;
		double totalnilai=0,ratanilai;
		System.out.print("Masukan banyak Nilai :");  
		jml = data.nextInt(); data.nextLine();  // Read user input
		int  nilai;
        //input data nilai
		for(i=1;i<=jml;i++)
		{
		 System.out.print("Masukan nilai ke-"+i+":"); 
		 nilai = data.nextInt(); data.nextLine();
		 totalnilai = totalnilai+nilai;
		}
		ratanilai=totalnilai/jml;
		System.out.println("Rata Nilai:"+ratanilai); 
		
		
	  }// end main
    }// end class

    