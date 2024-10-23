
// Xavi Blanes Curs 24/25

import java.util.Scanner;
public class Segon
{
  public static void main(String[] args) 
  {
    Scanner llegir = new Scanner(System.in);
    System.out.println("Coeficient de la X²: ");
    int a = llegir.nextInt();
    System.out.println("Coeficient de la X: ");
    int b = llegir.nextInt();
    System.out.println("Terme independent: ");
    int c = llegir.nextInt();

    if(a == 0) System.out.println("Si a és 0 no es una ecuació de 2n grau!!");
else{
        int discriminant = (b*b)-(4*a*c);
        if(discriminant < 0) System.out.println("La equació de 2n grau no té solucions!!");
        if(discriminant == 0) System.out.println("La equació de 2n grau té solució única i és: " + (-1*b)/(2*a));
        if(discriminant > 0) System.out.println("La equació de 2n grau no té dues solucions: " + ((-1*b)+Math.sqrt(discriminant))/(2*a) + ", " + ((-1*b)-Math.sqrt(discriminant))/(2*a));
    }
  }
}

