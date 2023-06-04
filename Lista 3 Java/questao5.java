import java.util.Scanner;

public class questao5 {
    public static void main ( String[] args){
        Scanner s = new Scanner(System.in);
        long v[] = new long[61];
        int n = s.nextInt();
        v[0] = 0;
        v[1] = 1;
        for (int j = 2; j <= 60; j++) {
            v[j] = v[j-2] + v[j-1];
        }

        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            System.out.printf("Fib(%d) = %d\n", x, v[x]);;
        }

    }
}