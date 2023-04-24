import java.util.Scanner;
public class KasirArrayMethod {
	
	public static void main(String[]args) {
	Scanner data = new Scanner (System.in);
	Scanner masukkan = new Scanner (System.in);
	String []produk = {"","Susu", "Kopi", "Tepung", "Gula ", "Sirup "};
       int []kode = {0,1, 2, 3, 4, 5};
       int []stok = {0, 50, 50, 50, 50, 50};
       int []harga = {0,15000, 10000, 12000, 14000, 25000};
       int i, jumlah;
	   char tambah='y';
	   
	   awal();
	   Garis ();
	   System.out.println(" |Kode		|Nama Barang		|Harga		|Stok		|");
	   Garis ();
	   
        for (i=1;i<produk.length;i++)
		{
            System.out.println(" |   "+kode[i]+"		|	"+produk[i]+"		|	"+harga[i]+"	|	"+stok[i]+" 	| ");
			Garis();
        }
	   
	   do 
		{
			Kosong();
            System.out.print("Masukkan kode barang yang ingin dibeli : ");
            i=data.nextInt(); data.nextLine();
            
            int []kuantitas = {0,0,0,0,0,0};
            int []hargatotal = {0,0,0,0,0,0};
            
            if (i>=1 && i<=kode[i])
			{
                System.out.print("Banyaknya barang yang ingin dibeli : ");
				
                jumlah=data.nextInt(); data.nextLine();
                if (jumlah<=stok[i])
				{
                    kuantitas[i] = kuantitas[i]+jumlah;
                    stok[i] = stok[i]-jumlah;
                    hargatotal[i] = hargatotal[i]+harga[i]*kuantitas[i];
                    Kosong();
					Garis();
                    System.out.println("|| Kode"+"	|	Produk"+"	|	Jumlah"+"   	|	Harga Total    ||");
                    Garis ();
                    System.out.println("  "+kode[i]+"     	"+produk[i]+"     	"+jumlah+" pcs" +"    		Rp"+hargatotal[i]);
					Garis();
					akhir();
                }
                else 
				{
                    System.out.print("\nMaaf, stok barang kami tidak cukup");
                }
                System.out.println("Apakah anda ingin menambahkan produk lain? (y/t)");
                tambah=data.next().charAt(0);data.nextLine();
            }
        }
        while(tambah=='y');
		
	}

    public static void Garis2()
		{
        System.out.println("===========================================================================");
		}
	
	public static void Garis()
		{
			System.out.println("-------------------------------------------------------------------------");
		}
		
	public static void Kosong ()
		{
			System.out.println(" ");
		}
		
    public static void awal()
		{
		Kosong();
		Garis2();
		System.out.println("-------------------------------Program Kasir-------------------------------");
		Garis2();
		Kosong();
		}
    public static void akhir()
		{
		Kosong();
		Garis2();
		System.out.println("-------------------------------Terimakasih-------------------------------");
		Garis2();
		Kosong();
		}
    
}
	
	   