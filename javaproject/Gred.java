//import class
import java.util.Scanner;
public class Gred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int math = 70;
    System.out.println("Sila masukkan gred sains anda: ");
    int gred = input.nextInt();

    input.close();

    if (gred == math){
        System.out.println("Markah sains anda adalah sama");
    }else{
        System.out.println("Markah sains anda tidak sama");
    }
    

    }
}
