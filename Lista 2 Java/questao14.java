import java.util.Scanner;

public class questao14 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int contpar = 0;
        int contimpar =0;
        int contpositivo = 0;
        int contnegativo = 0;
        int n;
        for (int i=0; i < 5; i++) {
            n = s.nextInt();
            if (n% 2 == 0) contpar++;
            else contimpar++;
            if (n > 0) contpositivo++;
            else if (n<0) contnegativo++;
        }
        System.out.println(contpar+ " valor(es) par(es)");
        System.out.println(contimpar + " valor(es) ímpa(res)");
        System.out.println(contpositivo + " valor(es) positivo(s)");
        System.out.println(contnegativo+ " valor(es) negativo(s)");
    }
}