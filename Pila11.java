// Create a Main class DELUXE
class Pila
{
    static int[] v;
    static int n;
   
    //Constructor con el mismo nombre de la clase
    public Pila()
    {
    n = 0;
    v = new int[100];
    }

    //Métodos de la clase
    public void apila(int x)
    {
    v[n] = x;
    n++;
    }

    public int desapila()
    {
    if(n>0)
    {
    int aux = v[n-1];
    n--;
    return aux;
    }
    else return -127;
    }
    public int top()
    {
    if(n>0) return v[n-1];
    else return -127;
    }
}
public class Main {
  public static void main(String[] args) {
    Pila unaPila = new Pila();

    unaPila.apila(1);
    unaPila.apila(2);
    unaPila.apila(3);

    System.out.println(unaPila.desapila());
    System.out.println(unaPila.desapila());
    System.out.println(unaPila.desapila());
    System.out.println(unaPila.desapila());
  }
}






  public static void main(String[] args) {
    Pila myPila = new Pila();
    
    myPila.push(1);
    myPila.push(3);
    myPila.push(4);
    System.out.println(myPila.top());
    System.out.println(myPila.top());
    System.out.println(myPila.top());
    System.out.println(myPila.pull());
    System.out.println(myPila.pull());
    System.out.println(myPila.pull());
  }
}

