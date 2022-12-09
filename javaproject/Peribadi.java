//import class
import java.time.Year;
import java.util.Scanner;
public class Peribadi {
    public static void main(String[] args) {
        
        //Pengisyhtiharan pembolehubah scanner
        Scanner input = new Scanner (System.in);

        //papar teks pernyataaan 1 & isytihar pembolehubah nilai input1
        System.out.println("Masukkan nama anda:"   );
        String nama = input.next();

        //papar teks pernyataan 2 & isytihar pembolehubah nilai input2
        System.out.println("Masukkan tahun dilahirkan:"   );
        int tahun = input.nextInt();

        //papar teks pertanyaan3 & isytihar pembolehubah nilai input3
        System.out.println ("Masukkan bandar anda dilahirkan: ");
        String negeri = input.next();
        input.close();

        //pengiraan umur
        int tahunsemasa = Year.now().getValue();
        int umur = tahunsemasa-tahun;

        //memaparkan output
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Bandar kelahiran : "+ negeri);
    }
}