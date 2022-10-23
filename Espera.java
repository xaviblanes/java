import java.util.Scanner;

public class Espera 
{

public static void espera(int n)
{
try { Thread.sleep(n);}
catch(Exception e){}
}
  public static void main(String[] args) 
  {
  Scanner leer=new Scanner(System.in);
  System.out.print("Teclea un número: ");
  int n = leer.nextInt();
  espera(n*1000);
  System.out.println(n);
  }
}

