import java.io.IOException;
import java.util.Scanner;

public class questao2 {
    public static void main (String[] Args) throws IOException {

        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        double delta = Math.pow(B,2)-4*A*C;
        double R1 = (-B + Math.sqrt(delta))/(2.0*A);
        double R2 = (-B - Math.sqrt(delta))/(2.0*A);

        if ((delta < 0.0 || A == 0)){
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f " ,R1);
            System.out.printf("\nR2 = %.5f " ,R2);

        }

    }
}
