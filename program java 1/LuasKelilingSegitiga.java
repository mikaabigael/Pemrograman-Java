import java.util.Scanner; //Import the Scanner class
class LuasKelilingSegitiga {
	public static void main(String[] args) {
        //deklarasi
       Scanner masukan = new Scanner(System.in); // Create a Scanner object
        double a,t,S1,S2,luas,keliling; //deklarasi saja (tipe bil desimal)
        final double kons=0.5; //final konstanta

        //inputan
        System.out.print("Masukan alas :");
        a = masukan.nextDouble(); masukan.nextLine();
        System.out.print("Masukan tinggi :");
        t = masukan.nextDouble(); masukan.nextLine(); 
       
        //perhitungan
        luas=kons*a*t;
        S1=Math.sqrt((Math.pow((kons*a),2))+(Math.pow(t,2)));
        S2=Math.sqrt((Math.pow((kons*a),2))+(Math.pow(t,2)));
        keliling=a+S1+S2;

        System.out.println("a. Luas Segitiga            : "+luas);
        System.out.println("b. Sisi miring Segitiga     : "+S1);
        System.out.println("c. Keliling Segitiga        : "+keliling);
        
    
	}
}

        
    