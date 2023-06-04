import java.util.Scanner;

public class questao3 {
    public static void main(String[] Args ){
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();

        if (V >= 0 && V <= 25) {
            System.out.println("Intervalo (0,25]");
        }
        else if(V >= 25 && V <= 50){
            System.out.println("Intervalo (25,50]");
        }
        else if(V >= 50 && V <= 75){
            System.out.println("Intervalo (50,75]");
        }
        else if(V >= 75 && V <= 100){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }

    }

}

