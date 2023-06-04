import java.util.Scanner;

public class questão14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma = 0;
        char O = s.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = s.nextDouble();
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j < M.length-i-1) soma += M[i][j];
            }
        }
        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2;
        System.out.println(String.format("%.1f", soma));
    }

}

