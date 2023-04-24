import java.util.Scanner; //Import the Scanner clas
class WhileGenapGanjil {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int i, bil;
        char ulang='y';
        
        while(ulang=='y' || ulang=='Y')//kondisi
        {
            System.out.print("masukkan bilangan utk dicek genap/ganjil :");
            bil = masukan.nextInt();   masukan.nextLine();
            
            if(bil%2==1)
            {System.out.println("bilangan ganjil");}else
            {System.out.println("bilangan genap");}

            System.out.print("Apakah ingin input bilangan lagi?(y/t):"); //badan perulangan
            ulang = masukan.next().charAt(0);   masukan.nextLine();
        }
        
        
        
        
        
        
    }
}