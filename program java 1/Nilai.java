import java.util.Scanner;
public class Nilai{
	public static void main(String[]args){
		Scanner data=new Scanner(System.in);
		int a;
	
		
		System.out.print("Masukkan Nilai Anda : ");
		a=data.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("-=====================-");
		if(a<60){
			System.out.println("Maaf Anda Gagal");
		}
		else if(a<=69){
			System.out.println("Anda Lulus dengan Kriteria : Cukup");
		}
		else if(a<=79){
			System.out.println("Anda Lulus dengan Kriteria : Baik");
		}
		else if(a<=100){
			System.out.println("Anda Lulus dengan Kriteria : Sangat Baik");
		}
		if ((a<0|a>100)){
		System.out.println("Maaf Input Tidak Valid");}
		
		
		
		
		
		
	}
}