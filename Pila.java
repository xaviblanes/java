// Classe Pila amb punters

public class Pila
{

    class Node
    {
        int info;
        Node seg;
    }

    private Node cap;

    public Pila ()
    {
        cap=null;
    }

    public void apila(int x) {
    	Node nou;
        nou = new Node();
        nou.info = x;
        if (cap==null)
        {
            nou.seg = null;
            cap = nou;
        }
        else
        {
            nou.seg = cap;
            cap = nou;
        }
    }

    public int desapila ()
    {
        if (cap!=null)
        {
            int info = cap.info;
            cap = cap.seg;
            return info;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    // informa si un enter està o no està apilat. 
    public boolean esta (int x)
    {
        Node p = cap;
        boolean trobat = false;
        while((p!=null)&&!trobat) 
            {
            trobat = (p.info == x);
            p = p.seg;
            }
        return trobat;
    }  
    
    public int top ()
    {
        int eltop;
        if(cap != null) eltop = cap.info;
        else eltop =  Integer.MAX_VALUE;
        return eltop;
    }  
    
    public boolean buida ()
    {
        boolean estabuida;
        if(cap == null) estabuida = true;
        else estabuida =  false;
        return estabuida;
    }  

    public void imprimir() {
        Node p=cap;
        System.out.println("Llistat de tots els elements de la pila");
        while (p!=null) {
            System.out.print(p.info+"-");
            p=p.seg;
        }
        System.out.println();
    }
    
    public static void main(String[] ar) {
        Pila laPila=new Pila();
        for(int i=1;i<21;i++) laPila.apila(i);
        laPila.imprimir();
        System.out.println(laPila.esta (110));
        System.out.println(laPila.top ());
        System.out.println(laPila.buida ());
        System.out.println("Ara despilem: "+laPila.desapila());
        laPila.imprimir();        
    }
}

