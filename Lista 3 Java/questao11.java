import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int C = s.nextInt();
            double soma = 0;
            char T = s.next().toUpperCase().charAt(0);
            double[][] M = new double[12][12];
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = s.nextDouble();
                }
            }
            for(int j = 0; j < M.length; j++) {
                soma += M[j][C];
            }
            if (T == 'M') soma /= M.length;
            System.out.println(String.format("%.1f", soma));
        }
    }
