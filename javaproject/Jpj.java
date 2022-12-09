//import class
import java.time.Year;
import java.util.Scanner;
public class Jpj {
    public static void main(String[] args) {

        //pengisytiharan pembolehubah scanner
        Scanner input = new Scanner(System.in);

        //papar teks kenyataan
        System.out.println("Masukkan tahun kelahiran: ");
        int tahun_lahir = input.nextInt();

        int tahun_semasa;
        int umur;

        tahun_semasa = Year.now().getValue();
        umur = tahun_semasa-tahun_lahir;


        input.close();

        if (umur > 15){
            System.out.println("Anda sudah layak memohon lesen motosikal");
        }else{
            System.out.println("Maaf, anda belum layak memohon lesen motosikal");
        }

    }
    
}
