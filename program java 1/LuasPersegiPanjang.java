import java.util.Scanner; //Import the Scanner class
class LuasPersegiPanjang {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in); // Create a Scanner object
        
        double panjang,lebar,luas; //deklarasi saja (tipe bil desimal)
        
        
        System.out.print("Masukan panjang :");
        panjang = masukan.nextDouble(); masukan.nextLine(); //Input double panjang
        System.out.print("Masukan nilai lebar :");
        lebar = masukan.nextDouble(); masukan.nextLine(); //Input double panjang
    
        luas=panjang*lebar;
        

        System.out.println("luas Persegi Panjang : "+luas);
		
   

	}
}