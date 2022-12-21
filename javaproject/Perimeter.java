import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //isytihar pembolehubah
        double lebar, tinggi;
        System.out.println("KIRA LUAS SEGITIGA");

        //ambil nilai tinggi
        System.out.println("Tinggi segitiga: " );
        tinggi = keyboard.nextDouble();
        //ambil nilai lebar
        System.out.println("Lebar segitiga: " );
        lebar = keyboard.nextDouble();

        keyboard.close();

        //panggil sub aturcara
        kiraSegiTiga (tinggi,lebar);
    }

    

//sub aturcara guna perimeter
public static void kiraSegiTiga (double tinggi, double lebar){
    //laksana operasi tanpa pulangkan nilai
    double luas = 0.5*tinggi*lebar;
    System.out.println("Luas segitiga adalah "+luas+" persegi.");
}
    
}
