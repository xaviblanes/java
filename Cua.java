// Classe Cua amb punters

public class Cua
{

    class Node
    {
        int info;
        Node seg;
    }

    private Node cap;
    private Node cua;

    public void Cua ()
    {
        cap=null;
        cua=null;
    }

    public void inserta (int x) {
    	Node nou;
        nou = new Node();
        nou.info = x;
        nou.seg = null;
        if(cua != null) cua.seg = nou;
        else cap = nou;
        cua = nou;
    }

    public int treu ()
    {
        int aux;
        if (cap!=null)
        {
            aux = cap.info;
            cap = cap.seg;
        }
        else
        {
            aux = Integer.MAX_VALUE;
        }
        return aux;
    }
   
// informa si un enter està o no està en la cua. 
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
        Cua c = new Cua();
        for(int i=1;i<20;i++) c.inserta (i);
        System.out.println(c.esta(7));        
        c.imprimir();
        System.out.println(c.buida ());
        System.out.println("Ara desencuem: "+c.treu());
        c.imprimir();        
    }
}

