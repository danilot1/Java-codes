import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int contpar = 0;
        int contimpar = 0;
        for (int i = 0; i < 15; i++) {
            int n = s.nextInt();
            if (contpar == 4) {
                for (int j = 0; j < 6; i++) {
                    System.out.println("par [" + j + "] = " + par[j]);
                    contpar = 0;
                }
            } else if (contimpar == 4) {
                for (int k = 0; k < 6; i++) {
                    System.out.println("impar [" + k + "] = " + impar[k]);
                    contimpar = 0;
                }
            }else{
                if (n % 2 == 0) {
                    par[contpar] = n;
                    contpar++;
                } else {
                    impar[contimpar] = n;
                    contimpar++;
                }


            }
        }

    }

}