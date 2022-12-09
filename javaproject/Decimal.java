import java.text.DecimalFormat;

public class Decimal {
    public static final DecimalFormat df = new DecimalFormat("00.00");

    public static void main(String[] args) {
        double result = 3; 
        System.out.println(df.format(result));
        
    }
    
}
