
public class Main {
  public static void main(String[] args) {
    Cua acua = new Cua();

    for(int i=1; i<97;i++) acua.inserta(i);
    
    for(int i=1; i<90;i++) System.out.println(acua.treu());
    System.out.println(acua.esta(2));
    
    
  }
}


class Cua
{
    static int[] v;
    static int cap, cua;
   
    //Constructor con el mismo nombre de la clase
    public Cua()
    {
    cap = 0;
    cua = 0;
    v = new int[100];
    }

    //Métodos de la clase
    public void inserta(int x)
    {
    	
	v[cua] = x;
	cua++;
	cua = cua%100;
    }
    
    public int treu()
    {
    	int aux;
	if (cap != cua)
		{
		aux = v[cap];
		cap++;
		cap = cap%100;
		}    
        else aux = -127;
        return aux;
    }
    
    public boolean esta(int x)
    {
	int i= cap;
	boolean trobat = false;
	while((i != cua)&&(!trobat))
		{		
		trobat = (v[i] == x);
		i++;
		i=i%100;
		}
	return trobat;
    }
}
