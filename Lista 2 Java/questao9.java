import java.util.Scanner;

public class questao9 {
    public static void main (String [] args) {
        Scanner s = new Scanner( System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        if( A >= B+C ) {
            System.out.println("NAO FORMA TRIANGULO");
        }
         if(Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO RETANGULO");
            }
         if(Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO OBTUSANGULO");
        }
         if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)){
                System.out.println("TRIANGULO ACUTANGULO");
        }
         if(A == B && B == C){
                System.out.println("TRIANGULO EQUILATERO");
        }
         if(A == B || A == C ||  B == C ){
                System.out.println("TRIANGULO ISOSCELES");
        }
    }

}
