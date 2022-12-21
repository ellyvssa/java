import java.util.Scanner;
public class Genap {
    public static void main(String[] args) {
//panggil semula sub aturcara 1, 2 dan 3
namaAnda();
soalan();
ucapan();
    }
//sub1
static void soalan(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan satu nombor bulat: ");
    int nombor = input.nextInt();

    input.close();
    
//TENTUKAN NOMBOR GENAP GANJIL
if (nombor % 2 == 0 ){
    System.out.println(nombor + " adalah nombor genap." );
}else{
    System.out.println(nombor + " adalah nombor ganjil." );
}
}
//sub 2
static void ucapan(){
    System.out.println("Terima kasih, sila cuba lagi");
}
//sub 3
static void namaAnda(){
    System.out.println("TENTUKAN NOMBOR GENAP/GANJIL");
    Scanner nama = new Scanner(System.in);
    System.out.print("Nama anda: ");
    String namaSendiri = nama.next();
    System.out.println("Terima kasih: "+namaSendiri);
}
    
}
