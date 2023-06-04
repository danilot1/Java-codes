import java.util.Scanner;

public class questao13 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int cont = 0;
        for (int i=0; i < 5; i++) {
            double n = s.nextDouble();
            if (n % 2 == 0) cont++;
        }
        System.out.println(cont + " valores pares");
    }
}
