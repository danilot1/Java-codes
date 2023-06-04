import java.util.Scanner;

public class questao9 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int NUMERO = s.nextInt();
        int HORAS_TRABALHADAS = s.nextInt();
        double SALARIO = s.nextDouble();
        double PRODUTO = (HORAS_TRABALHADAS * SALARIO);
        System.out.printf("NUMBER = %d\n  SALARY = U$ %.2f\n" , NUMERO , PRODUTO );

    }
}