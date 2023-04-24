import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[]args){
        Scanner data = new Scanner (System.in);
        
        String []produk = {"","Beras", "Telur", "Garam", "Roti ", "Susu "};
        int []kode = {0,1, 2, 3, 4, 5};
        int []stok = {0,10, 20, 30, 10, 15};
        int []harga = {0,26000, 15000, 20000, 10000, 20000};
        int i, jumlah;
       
        System.out.println("Kode"+"      "+"Produk"+"      "+"Harga"+"      "+"Stok");
       
        for (i=1;i<produk.length;i++){
            System.out.println(kode[i]+"         "+produk[i]+"       "+harga[i]+"       "+stok[i]);
        }
       
        char tambah='y';
        
        do {
            System.out.print("Masukkan kode barang yang ingin dibeli : ");
            i=data.nextInt(); data.nextLine();
            
            int []kuantitas = {0,0,0,0,0,0};
            int []hargatotal = {0,0,0,0,0,0};
            
            if (i>=1 && i<=kode[i]){
                System.out.print("Banyaknya barang yang ingin dibeli : ");
                jumlah=data.nextInt(); data.nextLine();
                if (jumlah<=stok[i]){
                    kuantitas[i] = kuantitas[i]+jumlah;
                    stok[i] = stok[i]-jumlah;
                    hargatotal[i] = hargatotal[i]+harga[i]*kuantitas[i];
                    System.out.println("\n-------------------------------------");
                    System.out.println("Kode"+"  "+"Produk"+"   "+"Jumlah"+"    "+"Harga Total");
                    System.out.println("-------------------------------------");
                    System.out.println(kode[i]+"     "+produk[i]+"     "+jumlah+" pcs" +"    Rp."+hargatotal[i]);
                }
                else {
                    System.out.println("\nMaaf, stok tidak cukup");
                }
                System.out.println("Apakah anda ingin menambahkan produk lain? (y/t)");
                tambah=data.next().charAt(0);data.nextLine();
            }
        }
        while(tambah=='y');

}
}