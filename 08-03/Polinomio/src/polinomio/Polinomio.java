/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomio;

/**
 *
 * @author spetr
 */
public class Polinomio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Representa pol1 = new Representa(2);
        pol1.carrega();
        //pol1.mostra();
        //System.out.println("Valor: " + pol1.avalia(3));
        
        Representa pol2 = new Representa(1);
        pol2.carrega();
        //pol1.mostra();
        //System.out.println("Valor: " + pol1.avalia(3));
        
        pol1.mostra();
        pol2.mostra();
        
        Representa pol3 = pol1.soma(pol2);
        pol3.mostra();
        
        Representa pol4 = pol1.multiplica(pol2);
        pol4.mostra();
        

        
    }
    
}
