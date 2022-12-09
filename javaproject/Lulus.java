//import class
import java.util.Scanner;
public class Lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Sila masukkan markah anda: ");
        int markah = input.nextInt();

        int ujian = 45;

        input.close();

        if (markah > ujian ){
            //paparan output tahniah
            System.out.println("Tahniah, anda lulus !");
        }else{
            //paparan output gagal
            System.out.println("Anda gagal, usaha lagi!");

        }

    }
    
}
