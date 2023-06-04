import java.util.Scanner;

public class questao10 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        double salario_fixo = s.nextDouble();
        double total_de_vendas= s.nextDouble();
        double operacao = (salario_fixo + 0.15 * total_de_vendas);
        System.out.printf("TOTAL = R$ %.2f\n", operacao );
    }
}