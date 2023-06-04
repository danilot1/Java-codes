import java.util.Scanner;

public class questao13 {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
      double A = s.nextDouble();
       double B = s.nextDouble();
       double C = s.nextDouble();
       double Area_Triangulo = (A*C/2);
       double pi = 3.14159;
       double Area_circulo = (pi*C*C);
       double Area_trapezio = ((A+B)*C/2);
       double Area_quadrado = (B*B);
       double Area_retangulo = (A*B);
       System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",Area_Triangulo,Area_circulo,Area_trapezio,Area_quadrado,Area_retangulo);
   }
}