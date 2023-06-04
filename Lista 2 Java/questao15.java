import java.util.Scanner;

public class questao15 {
    public static void main  (String [] args ){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i=0; i<=x; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
