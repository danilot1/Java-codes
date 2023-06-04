import java.util.Scanner;

public class questao5 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        float N1 = s.nextFloat();
        float N2 = s.nextFloat();
        float N3 = s.nextFloat();
        float N4 = s.nextFloat();
        float media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) /10;
            System.out.printf("Media: %.1f", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");

        }
        else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }
        else if (media  >= 5.0 && media <=6.9 ) {
            System.out.println("Aluno em exame.");
            float exame = s.nextFloat();
            System.out.println("Nota do exame: " + exame);
            float recalculomedia = (exame + media);
            if (recalculomedia >= 5) {
                System.out.println("Aluno aprovado.");
            }
            else if (recalculomedia <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.println ("Media final:" + recalculomedia);
        }

    }
}
