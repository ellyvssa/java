import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        
        //isytihar pemboleubah
        int input, i, j, k;
        
        //pengisytiharan pembolehubah scanner
        Scanner scan = new Scanner(System.in);

        //papar teks pernyataan 
        System.out.print("Bilangan baris piramid terbalik: ");
        input = scan.nextInt();

        //kawalan ulangan for dengan kawalan increment dan decrement
        for (i = input; i>=1;i--){
            for (j=input; j>i; j--){
                System.out.print("");
            } 
            for (k=1; k<(i*2); k++){

                //papar output 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
