import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        
        System.out.println("TEKA HURUF");
        System.out.println("Clue: huruf selepas G");
        

        Scanner sc = new Scanner(System.in);

        System.out.println("jawapan: ");
        char h = sc.next().charAt(0);
        char answer = 'H';

        //char abjad;

        sc.close();

        if (answer == h){
            System.out.print("Tahniah! jawapan anda betul");
        }else{
            System.out.println("Maaf, anda silap");
        }



    
    }
    
}
