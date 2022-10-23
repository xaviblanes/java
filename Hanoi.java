public class Hanoi
{

public static void hanoi(int d, char o, char de, char aux)
{
if(d==1) System.out.println(" Disc 1 de "+o+" a "+de);
else
    {
    hanoi(d-1,o,aux,de);
    System.out.println(" Disc "+d+" de "+o+" a "+de);
    hanoi(d-1,aux,de,o);
    }
    }
  public static void main(String[] args)
  {
    hanoi(4,'A','C','B');
   
  }
}


