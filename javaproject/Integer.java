import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        

        System.out.println("LETAKKAN NOMBOR INTEGER SAHAJA");

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nombor integer sahaja: ");
        int nom = input.nextInt();

        input.close();

        if(nom % 2 == 0){
            System.out.println("nombor " +nom+ " adalah nombor genap");

        }else{
            System.out.println("nombor " +nom+ " adalah nombor ganjil");
        }



        
    }
    
}
