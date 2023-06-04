import java.util.Scanner;

public class questao3 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        double pi = 3.14159;
        double raio = s.nextDouble();
        double area = raio*raio*pi;
        System.out.printf("A=%.4f" , area);
    }
}

