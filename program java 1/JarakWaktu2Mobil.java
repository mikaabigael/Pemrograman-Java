import java.util.Scanner; //Import the Scanner class
class JarakWaktu2Mobil {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        double kecepatanA, kecepatanB, jarakAB, waktutemu, jaraktemuA, jaraktemuB;

        //inputan
        System.out.print(" Kecepatan Mobil A      (km/jam)      :");
        kecepatanA= masukan.nextDouble(); masukan.nextLine(); 
        System.out.print(" Kecepatan Mobil B      (km/jam)      :");
        kecepatanB= masukan.nextDouble(); masukan.nextLine(); 
        System.out.print(" Jarak antara mobil A dan B (km)      :");
        jarakAB= masukan.nextDouble(); masukan.nextLine();
        

        //proses
        waktutemu = (double) jarakAB/(kecepatanA + kecepatanB);
        jaraktemuA = (double) jarakAB - (kecepatanA*waktutemu);
        jaraktemuB = (double) jarakAB - (kecepatanB*waktutemu);
        
        //output
        System.out.println("    Waktu bertemu mobil A dan B           (jam) : "+waktutemu);
        System.out.println("    Jarak awal mobil A ke titik temu       (km) : "+jaraktemuA);
        System.out.println("    Jarak awal mobil B ke titik temu       (km) : "+jaraktemuB);

    
	}
}