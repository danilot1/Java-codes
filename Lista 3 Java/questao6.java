import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] N = new int[1000];
        for (int i = 0; i < 1000; i++) {
            N[i] = i%T;
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
}