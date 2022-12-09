import java.util.Scanner;
public class Pt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Berapakah bilangan A dalam PT3: ");
        int gred = input.nextInt();

        System.out.println("Adakah benar anda mendapat A dalam Matematik dan juga Bahasa Inggeris ? ");
        boolean text = input.nextBoolean();

        input.close();

        if ( gred >= 5 ){
        }else if ( text == true){
                System.out.println("Tahniah anda layak memasuki kelas 4 Sains Komputer");
            }else{
                System.out.println("Maaf, anda tidak layak memasuki kelas 4 Sains Komputer");
            }
        }
    }
    


