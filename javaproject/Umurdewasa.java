//Import class
import java.time.Year;
import java.util.Scanner;
public class Umurdewasa {
   public static void main(String[] args) {
    
    //paparan output-makluman awal aturcara
    System.out.println("ATURCARA MENGIRA UMUR & PERINGKAT DEWASA");

    //Pengisytiharan pembolehubah Scanner
    Scanner input = new Scanner(System.in);

    //papar teks pernyataan 
    System.out.println("Taip tahun kelahiran anda dan tekan Enter: ");

    //pengisytiharan input dan output 
    int tahun_lahir = input.nextInt();
    int tahun_semasa;
    int umur;

    
    //pengiraan umur
    tahun_semasa = Year.now().getValue();
    umur = tahun_semasa - tahun_lahir;

 input.close();
 
    //menggunakan struktur kawalan if 
         if (umur < 19){
            
   //papar output
   System.out.println("Anda berumur "+umur+", anda belum dewasa."  ); 
         }
   } 
}
