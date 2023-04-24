import java.util.Scanner;
public class PersamaanKuadrat{
	public static void main(String[]args){
		Scanner data=new Scanner(System.in);
        int a,b,c;
		double D,x1,x2;
		String def;
		
        // Persamaan Kuadrat ax^2+bx+c
		System.out.println("bentuk persamaan kuadrat		= ax^2+bx+c");
		System.out.print("Masukkan Nilai a			= ");
		a=data.nextInt();
		System.out.print("Masukkan Nilai b			= ");
		b=data.nextInt();
		System.out.print("Masukkan Nilai c			= ");
		c=data.nextInt();
		System.out.println("Persamaan Kuadrat   			= "+a+"x^2"+" + "+b+"x + "+c);
		
		D=b*b-(4*a*c);
		System.out.println("Diskriminan				= "+D);
		System.out.println("");
		
		if(D==0){
			x1=-b/2*a;
			System.out.println("Akar-akar Persamaan yang didapat Sama/kembar");
		    System.out.println("Akar-Akar;     	  	x1=x2 = "+x1);}
		
		if(D>=0){
			System.out.println("Akar Persamaan yang didapat Nyata");
			x1=(-b+Math.sqrt(D))/2*a;
			x2=(-b-Math.sqrt(D))/2*a;
			System.out.println("x1					= "+x1);
			System.out.println("x2					= "+x2);
		}
		if(a>0&&D<0)
		{def="Positif";} else
		{def="Negatif";}
		
		if(D<0){
			System.out.println("Akar Persamaan yang didapat Khayal/Imajiner");
			System.out.println("Akar persamaan kuadrat berdefinit "+def);
		
		
		}
	}
}