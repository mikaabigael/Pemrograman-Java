import java.util.Scanner;   //Import the Scanner class
class PercabanganIf {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); //Create a Scanner object
         //bagian deklarasi
         int nilai;
         String statuslulus,ucapan=" anda belum beruntung";
         char konversi;
         //bagian input
         System.out.print("Inputkan NIlai :");
         nilai = masukan.nextInt();  masukan.nextLine();    //Red user input
         //bagian hitung
         //if tanpa else
        if(nilai<0)
         { System.out.println("Nilai tidak valid:");}
         //if dengan else
        if(nilai>=60)
            { statuslulus="LULUS"; ucapan=" Selamat";}else
            {statuslulus="TIDAK LULUS";}
        //if bersarang / nested if
        if(nilai>=80)
        {konversi='A';}else
        if(nilai>=60)
            {konversi='B';}else
            {konversi='C';}
        //if dengan 2 kondisi melibatkan operator logika and/or
        String validnilai;
        if ((nilai<0)|(nilai>100))
        {validnilai="Tidak Valid";}else
        {validnilai="Valid";}
        
         //bagian cetak
         System.out.println("Nilai adalah               :"+nilai);
         System.out.println("Status Kelulusan adalah    :"+statuslulus+" ,"+ucapan);
         System.out.println("Nilai Konversi adalah      :"+konversi);
         System.out.println("Kevalidan Nilai adalah     :"+validnilai);
     }  
}
