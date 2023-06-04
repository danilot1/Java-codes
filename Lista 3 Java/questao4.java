import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] N = new int[20];
        for (int i = 0; i < 20; i++) {
            N[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int aux = N[i];
            N[i] = N[19 - i];
            N[19 - i] = aux;


        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}