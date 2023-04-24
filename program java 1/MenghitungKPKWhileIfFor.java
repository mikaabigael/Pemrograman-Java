import java.util.Scanner; //Import the Scanner clas
class MenghitungKPKWhileIfFor {
    public static void main(String[] abc) {
        Scanner masukan = new Scanner(System.in); //Create a Scanner object
        //bagian deklarasi
        int a,b,cad,faktor,sisa;

        System.out.print("---------------------------");
        System.out.println("  ");
        System.out.println(" Menghitung KPK dari 2 Bilangan ");
        System.out.println("  ");
        
        System.out.print("masukkan bilangan pertama     :");
        a=masukan.nextInt();
        System.out.print("masukkan bilangan kedua       :");
        b=masukan.nextInt();

            if (a<b)
            {
            cad=a;
            a=b;
            b=cad;
            }

        faktor=1;
        for (int i=2;i<=b;i++)
        {
        sisa=b%i;
            if (sisa==0)
    
        for(int j=2;i<=a;j++)
        {
            if ((a%j)==0)

            if(i==j)
            faktor=j;
            break;
        }
    }

    System.out.println(" ");
    System.out.println("        KPK = "+(a*b/faktor));
    System.out.println(" ");
    System.out.print("---------------------------");
    }
}