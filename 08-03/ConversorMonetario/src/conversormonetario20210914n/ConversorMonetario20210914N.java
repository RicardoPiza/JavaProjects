/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormonetario20210914n;

/**
 *
 * @author spetr
 */
public class ConversorMonetario20210914N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Moeda real = new Moeda();
        real.setNome("R$");
        real.setConversao(1f);
        
        Moeda dolar = new Moeda();
        dolar.setNome("US$");
        dolar.setConversao(5.25f);
        
        Valor v1 = new Valor(10,real);
        Valor v2 = new Valor(10,dolar);
        
        Valor v3 = v2.converte(real);
        
        v1.status();
        v2.status();
        
        v3.status();
    }
    
}
