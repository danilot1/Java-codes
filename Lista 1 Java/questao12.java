import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double R = s.nextDouble();
        double pi =3.14159;
        double volume =(4 * pi *R*R*R/3);
        System.out.printf ("VOLUME = %.3f\n", volume);
    }
}
