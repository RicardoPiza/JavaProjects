/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol20210914n;

/**
 *
 * @author spetr
 */
public class Futebol20210914N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Time palmeiras = new Time();
        palmeiras.defineJogador(0, "Gustavo", 10);
        palmeiras.defineJogador(1, "Allan", 1);
        //palmeiras.defineJogador(0, "Luan", 17);
        palmeiras.substituiJogador("Gustavo", "Luan", 17);
        palmeiras.mostraTime();
    }
    
}
