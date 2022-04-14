/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exeingresso;

/**
 *
 * @author aewvs
 */
public class ExeIngresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngressoNormal in = new IngressoNormal();
        in.Imprime();
        Vip v = new Vip ();
        v.Imprime();
        CamaroteInferior ci = new CamaroteInferior("Ala norte");
        System.out.println("Localização: " + ci.localizacao);
        ci.Acessar();
    }
    
}
