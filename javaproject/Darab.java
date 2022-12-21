import java.util.Scanner;
public class Darab {
    public static void main(String[] args) {
        
        //paparan output-makluman awal aturcara 
        System.out.println("ATURCARA PERMAINAN MATEMATIK OPERASI DARAB");

        //pengisytiharan pembolehubah scanner
        Scanner input = new Scanner (System.in);

        //isytihar pembolehubah dan papar teks pernyataan 
        int nom1, nom2;
        String jawab;

        

        //kawalan ulangan do while
        do{
            System.out.print("Nombor pertama: ");
            nom1 = input.nextInt();
            System.out.print("Nombor kedua: ");
            nom2 = input.nextInt();
            
            input.close();
            
            //paparan output 
            System.out.println("Hasil darab: " +nom1+ "X" +nom2+ "=" + Math.abs(nom2 * nom1));

            //pertanyaan ulangan 
            System.out.print("Taipkan Y untuk teruskan...");
            jawab = input.next();

            //ulangan selagi syarat ditetapi
        }while (jawab.equals("Y") || jawab.equals("y"));

    }
    
}
