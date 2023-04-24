class Variabel {
	public static void main(String[] args) {
        int x=5; //deklarasi sekaligus inisialisasi
        int y=2;
        int jumlah,kurang,kali; //deklarasi saja (tipe bil bulat)
        double bagi; //deklarasi saja (tipe bil desimal)
        String mapel="MM cuy";
        jumlah=x+y; //inisialisasi jumlah dengan Proses hitung
        kurang=x-y;
        kali=x*y;
        bagi=(double)x/y;
        System.out.println("mata pelajaran      :   "+mapel);
		System.out.println("hasil penjumlahan   :   "+jumlah);
        System.out.println("hasil penjumlahan   :   "+(x+y));
        System.out.println("hasil penjumlahan   :   "+x+" + "+y+" = "+jumlah);
	    System.out.println("hasil penguranganan :   "+kurang);
        System.out.println("hasil perkalian     :   "+kali);
        System.out.println("hasil pembagian     :   "+bagi);
        
        

	}
}