import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = s.nextInt();
        for (int i = 1; i < 10; i++) {
            N[i] = N[i - 1] * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
}