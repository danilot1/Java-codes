import java.util.Scanner;

public class questao14 {
  public static void main (String[] args) {
       Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      int MaiorAB = ((a+b)+Math.abs(a-b))/2;
	  int maior = ((MaiorAB + c)+Math.abs(MaiorAB-c))/2;
      System.out.println(maior + " eh o maior");
  }
}
