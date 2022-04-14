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
public class Valor {
    private float qtde;
    private Moeda moeda;

    public Valor(float qtde, Moeda moeda) {
        this.qtde = qtde;
        this.moeda = moeda;
    }
    
       
    public Valor converte(Moeda novaMoeda)
    {
        Valor v = new Valor(0,novaMoeda);
        v.qtde = (this.qtde*this.moeda.getConversao())/novaMoeda.getConversao();
        return v;
                
    }
    
    public void status()
    {
        System.out.println("Valor: " + this.qtde);
        System.out.println("Moeda: " + this.moeda.getNome());
    }
    
}
