import java.util.Scanner; //Import the Scanner class
class Menukar2Data {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in);
        int a, b, temp;
        
        //inputan
        System.out.print("Masukkan nilai a  :");
        a = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan nilai b  :");
        b = masukan.nextInt(); masukan.nextLine();
        
        //perhitungan
        temp=a;
        a=b;
        b=temp;

        //out
        System.out.println("nilai a  =: "+a);
        System.out.println("nilai b  =: "+b);

	}
}