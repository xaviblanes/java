/*******************************************
**** Un programa que donada una paraula ****
**** calcula el criptograma en Cècar 3  ****
**** Xavi Blanes curs 20/21             ****
*******************************************/

import java.util.Scanner;

public class Cesar3 {
  public static void main(String[] args) {
    String paraula, criptograma = "", abecedari = "ABCDEFGHIJKLMNOPQRSTUVWXYZABC";
    char[] abc = abecedari.toCharArray();
    int i;
    Scanner teclat = new Scanner(System.in);
    System.out.print("Indoduix la paraula: ");
    paraula = teclat.nextLine().toUpperCase();
    char[] aux = paraula.toCharArray();
    for(i=0; i<paraula.length(); i++)
        criptograma = criptograma + abc[abecedari.indexOf(aux[i])+3];
    System.out.print("El criptograma en Cèsar3 és: " + criptograma + "\n");
  }
}

