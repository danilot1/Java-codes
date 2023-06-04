import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cont = 0;
        for (int i=0; i < 6; i++) {
            double n = s.nextDouble();
            if (n > 0) cont++;
            //int media
        }
        System.out.println(cont + " valores positivos");

    }

}