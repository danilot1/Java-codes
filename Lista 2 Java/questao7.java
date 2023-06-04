import java.util.Scanner;

public class questao7 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        if ((A<B+C) && (B<A +C) && (C<B+A)) {
            double perimetro = (A+B+C);
            System.out.printf ("Perimetro = %.1f\n", perimetro);
        }
        else {
            double area_do_trapezio = (A+B) *C/2;
            System.out.printf( "Area = %.1f\n" , area_do_trapezio);

        }
    }
}
