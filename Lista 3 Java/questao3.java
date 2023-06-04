import java.util.Scanner;

public class questao3 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        double [] A = new double[100];
        for (int i = 0; i < 100; i++) {
            A[i] = s.nextDouble();
        }
        for(int i =0; i < 100 ; i++ ){
            if( A[i] <=10 ){
                System.out.println(" A[" + i + "] = " + A[i]);
            }
        }
    }
}
