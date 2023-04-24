import java.util.Scanner;   
class MenentukanKelulusan {
     public static void main(String[] abc) {
         Scanner masukan = new Scanner(System.in); 
         int nilai;
         String statuslulus,konversi;
        
         System.out.print("Inputkan Nilai :");
         nilai = masukan.nextInt();  masukan.nextLine();    //Red user input
        
        
            if(nilai<60)
            {System.out.println("    maaf Anda TIDAK LULUS");} else
            
            if(nilai<=69)
            {System.out.println("   Anda LULUS, Kriteria kelulusan Anda : Cukup");} else
                
            if(nilai<=79)
            {System.out.println("   Anda LULUS, Kriteria kelulusan Anda : Baik");} else
            
            if(nilai<=100)
            {System.out.println("   Anda LULUS, Kriteria kelulusan Anda : Sangat Baik");}
   
            if ((nilai<0)|(nilai>100))
            {System.out.println("   Inputan nilai tidak valid");}
        
       
        
     }  
}