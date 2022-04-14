/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author aewvs
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = kb.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = kb.nextFloat();
        float media = (n1+n2)/2;
        System.out.println("A média é: " + media);*/
       
       /*int numero = 10;
       int valor = 4 + numero++; //++numero, numero-- e --numero
        System.out.println(valor);
        System.out.println(numero);*/
      
       /*int x = 4;
       x += 2; // tambem pode ser usado multiplicação x*=2
       x = (int) Math.pow(x,3);
       System.out.println(x);*/
       
       /*float v = 8.3f;
       int ar = (int) Math.floor(v); //Math.ceil --> arredonda para cima Math.round --> Arredonda aritmeticamente
       System.out.println(v);*/
       
       double random =  Math.random();
       int n = (int) (15 + random * (50-15)); //numero aleatório entre 15 e 50, mudando o primeiro e o segundo 15
       System.out.println(n);
       
    }
    
}
