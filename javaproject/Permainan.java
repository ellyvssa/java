import java.util.Scanner;
public class Permainan {
    public static void main(String[] args) {
        
        //paparan output-makluman awal aturcara 
        System.out.println("ATURCARA PERMAINAN MATEMATIK OPERASI TAMBAH");

        //pengisytiharan pembolehubah scanner
        Scanner input = new Scanner(System.in);

        //isytihar pembolehubah dan papar teks pernyataan
        int nom1 = ( int )(Math.random()*101);
        int nom2 = ( int ) (Math.random()*101);

        System.out.print("Nyatakan jawapan " + nom1 + "+" +nom2+ "=");
        int jawapan = input.nextInt();

        input.close();

        //kawalan ulangan guna while
        while (nom1 + nom2 != jawapan){
        
            //papar output jika jawapan salah dan ulang tanya
            System.out.print("Jawapan anda salah! sila cuba lagi... \n Nyatakan Jawapan " +nom1+ "+" +nom2+ "=" );
            jawapan = input.nextInt();

        }
        //papar output jika jawapan betul 
        System.out.println("Tahniah, jawapan anda betul!" );
    }
    
}
