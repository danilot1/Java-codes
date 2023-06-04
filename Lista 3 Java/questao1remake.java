import java.util.Scanner;

public class questao1remake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] X = new int[10];
        int aux;
        for (int i = 0; i < 10; i++) {
            aux = s.nextInt();
            if(aux<=0){
                X[i] = 1;
            }else{
                X[i]=aux;
            }
        }
        for(int i =0; i<X.length; i++){
            System.out.println("X["+ i +"] = " + X[i]);

        }

    }
}