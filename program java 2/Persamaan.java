/*
Dicky Mario Lumbantobing
*/
import java.util.Scanner;
public class Persamaan{
	public static void main(String[]args){
		Scanner data=new Scanner(System.in);
		int a,b,c;
		double D,x1,x2;
		String def;
		
		System.out.print("Masukkan Nilai a : ");
		a=data.nextInt();
		System.out.print("Masukkan Nilai b : ");
		b=data.nextInt();
		System.out.print("Masukkan Nilai c : ");
		c=data.nextInt();
		System.out.println("-=====================-");
		System.out.println("Persamaan= "+a+"^2"+"."+b+"."+c);
		
		D=b*b-(4*a*c);
		System.out.println("");
		System.out.println("Determinan = "+D);
		System.out.println("");
		
		if(D==0){
			x1=-b/2*a;
			System.out.println("Akar Persamaan yang didapat Sama");
		System.out.println("Akar-Akarnya : x1=x2="+x1);}
		
		if(D>0){
			System.out.println("Akar Persamaan yang didapat Nyata");
			x1=(-b+Math.sqrt(D))/2*a;
			x2=(-b-Math.sqrt(D))/2*a;
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}
		if(a>0&&D<0){
		def="Positif";}else{
		def="Negatif";}
		
		if(D<=0){
			System.out.println("Akar Persamaan yang didapat Khayal");
			System.out.println("Akar kuadrat Definit adalah "+def);
		
		
		}
	}
}
