import java.util.Scanner;
public class Llegir 
{
  public static void main(String[] args) 
  {
    Scanner llegir = new Scanner(System.in);
    System.out.print("Teclea un número: ");
    int n = llegir.nextInt();
    System.out.println(n);
  }
}

