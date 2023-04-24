import java.util.Scanner; //Import the Scanner class
class KonversiWaktu2 {
	public static void main(String[] args) {
        //deklarasi
        Scanner masukan = new Scanner(System.in);
        int jamA, menitA, detikA, jamB, menitB, detikB,konvJam,konvMenit,konvDetik,totalA,totalB,selisih,sisa1,sisa2;
        
        //02:10:10 => 04:00:00
        //1jam, 49menit, 50detik

        //inputan
        System.out.print("Masukkan jam mulai        :");
        jamA = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan menit mulai      :");
        menitA = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan detik mulai      :");
        detikA = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan jam berakhir     :");
        jamB = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan menit berakhir   :");
        menitB = masukan.nextInt(); masukan.nextLine();
        System.out.print("Masukkan detik berakhir   :");
        detikB = masukan.nextInt(); masukan.nextLine();
        
        //perhitungan
        totalA=jamA*3600+menitA*60+detikA;
        totalB=jamB*3600+menitB*60+detikB;
        selisih=totalB-totalA; // misal 4000
        sisa1=selisih%3600; // 4000 detik=>  1jam sisa1=400
        konvJam=selisih/3600; // atau konvJam=(selisih-sisa1)/3600 // konvJam=1
        sisa2=sisa1%60; //400 detik => 60 menit, sisa2=40 detik
        konvMenit=sisa1/60; // atau konvMenit=(sisa1-sisa2)/60 // konvMenit=6menit
        konvDetik=sisa2; // konvDetik=40 detik


        //output
        System.out.println("konversi jam    = "+konvJam+" jam");
        System.out.println("konversi menit  = "+konvMenit+" menit");
        System.out.println("konversi detik  = "+konvDetik+" detik");
        System.out.println("konversi waktu  = "+konvJam+" jam " + konvMenit+" menit "+ konvDetik+" detik");
	}
}