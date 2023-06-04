import java.util.Scanner;

public class questao9 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] X = new int[N];
        int menor = 0, pmenor = 0;
        for (int i = 0; i < N; i++) {
            X[i] = s.nextInt();
            if (i == 0) {
                menor = X[i];
                pmenor = i;
            } else if (X[i] < menor) {
                menor = X[i];
                pmenor = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pmenor);
    }

}

