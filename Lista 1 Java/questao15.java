import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        double consumo_medio = (x/y);
        System.out.printf("%.3f km/l\n", consumo_medio);
    }
}