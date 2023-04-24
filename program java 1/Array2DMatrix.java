import java.util.Scanner;  // Import the Scanner clas
class Array2DMatrix {
      public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  // Create a Scanner object
        int i,j,ordo;
		double totalnilai=0,ratanilai;
		System.out.print("Masukan ordo n (n x n):");  
		ordo = data.nextInt(); data.nextLine();  // Read user input
		int [][] A = new int[ordo+1][ordo+1];
		int [][] B = new int[ordo+1][ordo+1];
		int [][] C = new int[ordo+1][ordo+1];		
		//bagian input
		System.out.println("INPUT MATRIX A :");
		for(i=1;i<=ordo;i++)
			{
			for(j=1;j<=ordo;j++)
				{				
				System.out.print("baris ke-"+i+" kolom ke-"+j+":");  
				A[i][j] = data.nextInt(); data.nextLine();  
				}
			}
		System.out.println("INPUT MATRIX B :");
		for(i=1;i<=ordo;i++)
			{
			for(j=1;j<=ordo;j++)
				{				
				System.out.print("baris ke-"+i+" kolom ke-"+j+":");  
				B[i][j] = data.nextInt(); data.nextLine();  
				}
			}
      	//bagian hitung penjumlahan
        for(i=1;i<=ordo;i++)
			{
			for(j=1;j<=ordo;j++)
				{				
				C[i][j] = A[i][j]+B[i][j];  
				}
			}		
		//bagian cetak
		System.out.println("CETAK MATRIX A :");
		for(i=1;i<=ordo;i++)
			{
			System.out.print("| ");	
			for(j=1;j<=ordo;j++)
				{				
		         System.out.print(A[i][j]+" ");   
				}
			System.out.print("|");	
			System.out.println();
			}
			
		System.out.println("CETAK MATRIX B :");
		for(i=1;i<=ordo;i++)
			{
			System.out.print("| ");	
			for(j=1;j<=ordo;j++)
				{				
		         System.out.print(B[i][j]+" ");   
				}
			System.out.print("|");	
			System.out.println();
			}
		System.out.println("CETAK MATRIX C = A+B :");
		for(i=1;i<=ordo;i++)
			{
			System.out.print("| ");	
			for(j=1;j<=ordo;j++)
				{				
		         System.out.print(C[i][j]+" ");   
				}
			System.out.print("|");	
			System.out.println();
			}
	  }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	for(i=1;i<=ordo;i++)
		{
		System.out.print("| ");	
			for(j=1;j<=ordo;j++)
			{				
			System.out.print(A[i][j]+" ");		  
			}
		System.out.print("|");	
		System.out.println();
		}

    */