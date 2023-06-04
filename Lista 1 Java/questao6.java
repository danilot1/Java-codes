import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double MEDIA = ((a*3.5) + (b*7.5)) /11;
        System.out.printf("MEDIA =  %.5f\n", MEDIA );
    }
}