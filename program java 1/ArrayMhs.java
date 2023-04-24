import java.util.Scanner;  // Import the Scanner clas
class ArrayMhs {
      public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        int i,jmlmhs;
		System.out.print("Masukan jumlah Mhs :");  
		jmlmhs = data.nextInt(); data.nextLine();  // Read user input
		String [] nim = new String[jmlmhs+1];
		int [] nilaimtk = new int[jmlmhs+1];
		int [] nilaialgo = new int[jmlmhs+1];
		
		//bagian input
		for(i=1;i<=jmlmhs;i++)
			{	
			System.out.print("Masukan Nim ke-"+i+" Mhs :");  
			nim[i] = data.nextLine();  
			}
		for(i=1;i<=jmlmhs;i++)
			{	
			System.out.print("Masukan nilai mtk mhs ke-"+i+" :");  
			nilaimtk[i] = data.nextInt(); data.nextLine();  
			}
		for(i=1;i<=jmlmhs;i++)
			{	
			System.out.print("Masukan nilai algo mhs ke-"+i+" :");  
			nilaialgo[i] = data.nextInt(); data.nextLine();  
			}
		//bagian hitung
		double totalnilaimtk=0;
        double ratanilaimtk; 
		double totalnilaialgo=0;
        double ratanilaialgo;		
		for(i=1;i<=jmlmhs;i++)
		{
		  totalnilaimtk=totalnilaimtk+nilaimtk[i];
		  totalnilaialgo=totalnilaialgo+nilaialgo[i];		  
		}
		ratanilaimtk=totalnilaimtk/jmlmhs;
		ratanilaialgo=totalnilaialgo/jmlmhs;
		   //hitung ip per mhs
		double [] ip = new double[jmlmhs+1];
		for(i=1;i<=jmlmhs;i++)
		{
			ip[i]=(double)(nilaimtk[i]+nilaialgo[i])/2;
		} 
        double totalnilaiip=0;
        double ratanilaiip;	
        for(i=1;i<=jmlmhs;i++)
		{
		  totalnilaiip=totalnilaiip+ip[i];
		}
		
		ratanilaiip=totalnilaiip/jmlmhs;		
		//bagian cetak
		for(i=1;i<=jmlmhs;i++)
		{
		System.out.println("Nim ke-"+i+" mhs adalah: " + nim[i]);  
		}
		
		for(i=1;i<=jmlmhs;i++)
		{
		System.out.println("Nilai mtk mhs ke-"+i+" adalah: " + nilaimtk[i]);  
		}
		
		System.out.println("Rata Nilai  matematika :"+ratanilaimtk); 
		
		for(i=1;i<=jmlmhs;i++)
		{
		System.out.println("Nilai algoritma mhs ke-"+i+" adalah: " + nilaialgo[i]);  
		}
		
		System.out.println("Rata Nilai algortima :"+ratanilaialgo);
		
		for(i=1;i<=jmlmhs;i++)
		{
		System.out.println("Nilai IP mhs ke-"+i+" adalah: " + ip[i]);  
		}
		
		System.out.println("Rata Nilai ip :"+ratanilaiip);
	  }
    }

    