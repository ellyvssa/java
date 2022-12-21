//import java
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final double centimili, calfah, kiloba;

        //paparan output 
        System.out.println("Masukkan milimeter: ");
        double milimeter = input.nextDouble();
        System.out.println("Masukkan calcius: ");
        double calcius = input.nextDouble();
        System.out.println("Masukkan kilometer: ");
        double kilometer = input.nextDouble();

        input.close();

        centimili = milimeter / 10;
        calfah = calcius * 33.8;
        kiloba = kilometer * 0.62;

        System.out.println("Milimeter kepada centimeter: "+centimili);
        System.out.println("Milimeter kepada celcius: "+calfah);
        System.out.println("Milimeter kepada batu: "+kiloba);
    }    
}
  