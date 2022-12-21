//import scanner 
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        
        //isytihar pembolehubah
        int input,i,j,k;
        
        //pengisytiharan pembolehubah scanner
        Scanner scan = new Scanner(System.in);

        //papar teks pernyataan
        System.out.println("Bilangan baris piramid terbalik: ");
        input = scan.nextInt();

        //kawalan ulangan for dengan kawalan increment dan decrement 
        for (i=input;i>=1;i--){
            for (j=input;j>i;j--){
                System.out.println("");
            }
        for (k=1;k<(i*2);k++){

            //papar output 
            System.out.println("*");
        }
        System.out.println();
        }
    }
    
}
