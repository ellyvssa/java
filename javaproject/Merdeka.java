//import class
import java.util.Scanner;
public class Merdeka {
    public static void main(String[] args) {

//paparan output-makluman awal aturcara 
System.out.println("ATURCARA TENTUKAN LAHIR SEBELUM/SELEPAS MERDEKA");

//pengisytiharan pembolehubah Scanner
Scanner input = new Scanner(System.in);


//papar teks pernyataan 
System.out.print("Masukkan tahun anda dilahirkan dan tekan ENTER:");
int lahir = input.nextInt();

input.close();
//pengisytiharan pembolehubah input 
int merdeka = 1957;

//menggunakan struktur kawalan if else 
if (lahir > merdeka){

//papar output True 
System.out.println("Anda dilahirkan selepas merdeka" );

}else{

    //papar output False
    System.out.println("Anda dilahirkan sebelum merdeka");
}
        
    }
    
}
