import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();
    double MEDIA = ((A*2) + (B*3) + C*5) /10;
        System.out.printf("MEDIA = %1f\n" , MEDIA);
}
}