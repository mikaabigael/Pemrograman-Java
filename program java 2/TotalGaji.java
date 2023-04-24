import java.util.Scanner;
public class TotalGaji{
	public static void main (String []args){
		Scanner Gol=new Scanner(System.in);
		int a,b,c=3000000;
		
		System.out.println("Masukkan Golongan Anda : ");
		System.out.println("Gol 1");
		System.out.println("Gol 2");
		System.out.println("Gol 3");
		System.out.print("Gol = ");
		a=Gol.nextInt();
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("-================-");
		
		
		switch(a){
			case 1 : System.out.println("Gaji anda adalah : Rp. 1.000.000");break;
			case 2 : System.out.println("Gaji anda adalah : Rp. 2.000.000");break;
			case 3 : System.out.println("Gaji awal anda sebesar Rp. 3.000.000");
			System.out.println("Anda dikenakan pajak sebesar 2%");
			System.out.println("Gaji anda adalah : Rp.  "+(int)(c-(c*0.02)));break;
			default : System.out.println("Maaf Input Salah, Silahkan Ulangi");break;
		}
	}
}
