import java.util.Scanner; //Import the Scanner clas
class PerulanganFor {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int i, jmlulang;
        System.out.print("Inputan jumlah perulangan :");
        jmlulang = masukan.nextInt();   masukan.nextLine();
        //perintah for
        /*
        for(i=1;i=jmlulang;i++) //nilai awal, kondisi, terminasi
        {
            System.out.println("Selamat Pagi!"); //badan perulangan
        }
       
        for(i=1;i<=jmlulang;i++)
        {
            System.out.println("Cetak Kata Ke"+i);
        }
        //lompat 2 angka
        for(i=1;i<=jmlulang;i+=2) //i=i+2
        {
            System.out.println("Cetak Kata Ke-"+i);
        }
        //cetak angka mundur
        for(i=jmlulang;i>=1;i--) //i=i-1
        {
            System.out.println("Cetak Kata Ke-"+i);
        }
        //cetak bil ganjil antara 1-n (n diinput)
        for(i=1;i<=jmlulang;i++)
        {
            if(i%2==1)
            {System.out.println(i);}
        }
        //cetak bil ganjil antara 1-n (n diinput)
        for(i=1;i<=jmlulang;i+=2)
        {
            System.out.println(i);
        } 
        //cetak n bilangan ganjil pertama bil asli
        for(i=1;i<=jmlulang;i++)
            if(i&2==1)
                {System.out.println(i);}
        }
        //cetak bil ganjil antara 1 sampai n (n diinput)
        for(i=1;i<=jmlulang;i+=2)
        {
            System.out.println(i);
        }
        */
        //cetak n bilangan asli genap pertama
        int U;
        for (i=1;i<=jmlulang;i++)
        {
            U=2*i; //Un=2n
            System.out.println(U);
    
        }
    }
}