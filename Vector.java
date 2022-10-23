public class Vector
{
     int x;
     int y;
    
    public void ini (int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public void suma (Vector u, Vector v)
    {
        u.x = u.x+v.x;
        u.y = u.y+v.y;
    }
    
    public void resta (Vector u, Vector v)
    {
        u.x = u.x-v.x;
        u.y = u.y-v.y;
    }
    
    public void producte_x_1_escalar (Vector u, int n)
    {
        u.x = n*u.x;
        u.y = n*u.y;
    }
    
    public int producte_escalar (Vector u, Vector v)
    {
        return (u.x*v.x)+(u.y*v.y);
    }
    
    public  void imprimir ()
    {
        System.out.println(this.x+", "+this.y);
    }
    
    
    public static void main(String[] ar) {
        Vector u =new Vector();
        Vector v =new Vector();

        u.ini(100,200);
        v.ini(3,4);

        u.suma (u,v);
        u.imprimir();
        
        u.resta (u,v);
        u.imprimir();
        
        u.producte_x_1_escalar(u,7);
        u.imprimir();
        
        System.out.println(u.producte_escalar(u,v));

            
    }
}

