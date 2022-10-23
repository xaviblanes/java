public class Determinant
{
    // Mètode cofactor 
    static void cofactor (int matriu[][], int aux[][], int p, int q, int n)
    {
        int i = 0, j = 0;
        for(int fil=0;fil<n;fil++)
            for(int col=0;col<n;col++)
             if((fil!=p)&&(col!=q))
                {
                aux[i][j++] = matriu[fil][col];
                if(j == n-1)
                    {
                    j=0;
                    i++;
                    }
                }
    }
    // Mètode que aplica la regla Sarrus
    static int determinant (int matriu[][], int n)
    {
    if(n==1) return matriu[0][0];
    else
    {
    int aux[][] = new int[n-1][n-1];
    int parcial =0;
    int signe =1;
    for(int i=0;i<n;i++)
        {
        cofactor(matriu,aux,i,0,n);
        parcial = parcial + (signe*matriu[i][0]* determinant( aux,n-1));
        signe = -signe;
        }
    return parcial;
    }
    }
    
    
    public static void main(String[] args)
    {
    int m[][] = {{4, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    //int m[][]={{3}};
    System.out.println(determinant(m,4));
    }
}
