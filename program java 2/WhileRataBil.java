import java.util.Scanner; //Import the Scanner clas
class WhileRataBil {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int  bil, total=0 ;
        int banyakbil=0;
        char ulang='y';
        double rata;
        
        while (ulang=='y' || ulang=='Y'); //kondisi
        {
            System.out.print("masukkan bilangan utk dicari rata-rata :");
            bil = masukan.nextInt();   masukan.nextLine();
            total=total+bil;
            banyakbil=banyakbil+1;
            
            //terminasi 
            System.out.print("Apakah ingin input bilangan lagi?(y/t):"); 
            ulang = masukan.next().charAt(0);   masukan.nextLine();
        }
        rata=(double)total/banyakbil; 
        System.out.print("hasil rata-rata:"+rata);
        
    }
}