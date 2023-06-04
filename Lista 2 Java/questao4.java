import java.util.Scanner;

public class questao4 {
    public static void main(String[] Args) {
        Scanner s = new Scanner(System.in);
        int cod = s.nextInt();
        int quant = s.nextInt();
        switch(cod){
            case 1:
                double cachorroquente;
                cachorroquente = 4.00 * quant;
                System.out.printf("Total: R$ %.2f\n" ,cachorroquente);
                break;
            case 2:
                double xsalada;
                xsalada = 4.50 * quant;
                System.out.printf("Total: R$ %.2f\n" ,xsalada);
                break;
            case 3:
                double xbacon;
                xbacon = 5.00 * quant;
                System.out.printf("Total: R$ %.2f\n" ,xbacon);
                break;
            case 4:
                double torradasimples;
                torradasimples = 2.00 * quant;
                System.out.printf("Total: R$ %.2f\n" ,torradasimples);
                break;
            case 5:
                double refrigente;
                refrigente = 1.50 * quant;
                System.out.printf("Total: R$ %.2f\n" ,refrigente);
                break;




        }
    }
}