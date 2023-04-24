import java.util.Scanner;
public class Kasir{
	public static void main (String[]args);
	Hitung htg=new Hitung();
	System.out.println("\n=========================================	Program Mesin Kasir\n=========================================");
	htg.inputBrg();
	htg.tampil();
	System.out.println("\n=========================================");
	System.out.println("Terimakasih Telah Menggunakan Program Kami");
	System.out.println("=======================================");
	System.exit(0);
	}
}


import java.util.Scanner;
class Hitung{
	public String nama[]=new String[20];
	public int Brg[]=new int[15];
	public int jumlahBrg[]=new int[15];
	public int i, jumlahBeli;
	public double harga Tt[]=new double[15];
	public double totalHarga=0, diskon=0, totalBayar=0;
	
	Scanner masukkan=new Scanner(System.in);
	
	public void inputBrg(){
	System.out.print("\n Jumlah Pembelian "); jumlahBeli=masukkan.nexInt();
	System.out.println("\n=========================================");
		System.out.print("\n Nama Barang ke-"+i+" : ");nama[i]=masukkan.nexInt();
		System.out.print(" Jumlah Barang : ");jumlahBrg[i]=masukkan.nexInt();
		System.out.print(" Harga Barang : Rp");hargaBrg[i]=masukkan.nexInt();
		hargaTt[i]=jumlahBrg[i]*hargaBrg[i];
		totalHarga=hargaTt[i]+totalHarga;
	}
	System.out.println("\n=========================================");
	if(totalHarga>=1000000)diskon=0.2*totalHarga;
	else if ((totalHarga>=500000)$$(totalHarga<1000000))diskon=0.1*totalHarga;
	else diskon=0;
	totalBayar=totalHarga-diskon;
	}
	
	public void tampil(){
		System.out.println("\n\n\		Daftar Barang Pembelian");
		System.out.println("=======================================");
		System.out.println(" ||	Nama Barang	||	Jumlah	||	Harga	||	Total	||");
		System.out.println("=======================================");
		
		*/
		System.out.println(String.format("||%-16s||%3d||Rp%6d||Rp%7.0f||",nama[i],jumlahBrg[i],hargaBrg[i],hargaTt[i]));
		}
		
		System.out.println("========================================");
		System.out.println(String.format("\n Total			=Rp%10.0f",totalHarga));
		System.out.println(String.format("Diskon			=Rp%10.0f",diskon));
		System.out.println(String.format("Total Pembayaran	=Rp%10.0f",totalBayar));
		}
	}












}
