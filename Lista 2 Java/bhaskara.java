import java.util.Locale;
import java.util.Scanner;


public class baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double delta = B*B-4*A*C;
        double R1 = (-B+Math.sqrt(delta))/(2.0*A);
        double R2 = (-B-Math.sqrt(delta))/(2.0*A);

        if ((delta < 0.0 || A == 0)){
            System.out.println("Impossivel calcular");
        }else{
            System.out.printf("R1 = %.5f%n " ,R1);
            System.out.printf("R2 = %.5f%n " ,R2);
        }
        input.close();
    }
}
