import java.util.Scanner; //Import the Scanner class
class JenisSegitigaMethod {
    public static void main(String[]abc){
        Scanner masukan = new Scanner (System.in); //Create a Scanner object
		int A, B, C;
		kosong();
		garis2();
		System.out.println("Menentukan Jenis Segitiga");
		garis2();
		kosong();
		System.out.print("Masukan Panjang Sisi A        : ");
		A = masukan.nextInt();
        System.out.print("Masukan Panjang Sisi B        : ");
        B = masukan.nextInt();
        System.out.print("Masukan Panjang Sisi C        : ");
        C = masukan.nextInt();
		kosong();
		
		if ((C*C) == (B*B) + (A*A)) {
            if ((A == B) || (A == C)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku");
            }
        } else if ((B * B) == (C * C) + (A * A)) {
            if ((A == B) || (A == C)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku");
            }
        } else if ((A * A) == (C * C) + (B * B)) {
            if ((A == B) || (A == C)) {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Siku Siku");
            }
        } else if ((A == B) && (B == C)) {
            System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Sama Sisi");
        } else if ((A == B) || (A == C)) {
            System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga dengan Panjang Sisi A :" + A + ", Sisi B : " + B + ", Sisi C : " + C + " termasuk Segitiga Sembarang");
        
		}
    }
	
		
		public static void garis2() 
		{
			System.out.println("==========================");
		} 
		public static void kosong() 
		{
			System.out.println(" ");
		} 
}