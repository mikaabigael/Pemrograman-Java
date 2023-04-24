import java.util.Scanner;   
class TotalGajiGolongan {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); 
         int A,Gol3=3000000;
       
        System.out.println("Masukkan Golongan gaji Anda :");
        System.out.println("Golongan 1, pilih 1");
        System.out.println("Golongan 2, pilih 2");
        System.out.println("Golongan 3, pilih 3");
        System.out.print("Golongan Gaji    :");
        A = masukan.nextInt(); 

        System.out.println("");

        switch(A){
			case 1 :  System.out.println("Total gaji anda      : Rp1.000.000");break;
			case 2 :  System.out.println("Total gaji anda      : Rp2.000.000");break;
			case 3 :  System.out.println("Gaji anda            : Rp3.000.000");
			          System.out.println("          Anda dikenakan pajak sebesar 2%");
			          System.out.println("Total gaji anda      : Rp"+(Gol3-(Gol3*0.02)));break;
			default : System.out.println("          Maaf Inputan Anda Salah, Silahkan masukkan inputan yang benar");break;

        }
     }
}

