public class Anima {

    // Mètode escriu terminal
    public static void escriu_t(String s)
    {
        System.out.print(s);
    }
   
    // Mètode esborra terminal
    public static void esborra_t()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Mètode espera n milisegons
    public static void espera(int n)
    {
        try {Thread.sleep(n);} catch (InterruptedException ex) {}
    }
    public static void main(String[] args){
        int i, t=166;     
        for(i=0;i<100;i++)
        {
        escriu_t("[****   ]" + i +"%");
        espera(t);
        esborra_t();
        escriu_t("[ ****  ]"+ i +"%");
        espera(t);
        esborra_t();
        escriu_t("[  **** ]"+ i +"%");
        espera(t);
        esborra_t();
        escriu_t("[   ****]"+ i +"%");
        espera(t);
        esborra_t();
        escriu_t("[  **** ]"+ i +"%");
        espera(t);
        esborra_t();
        escriu_t("[ ****  ]"+ i +"%");
        espera(t);
        esborra_t();
        }
    }
}

