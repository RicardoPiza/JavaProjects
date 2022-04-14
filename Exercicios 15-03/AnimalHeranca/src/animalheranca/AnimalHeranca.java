/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalheranca;

/**
 *
 * @author aewvs
 */
public class AnimalHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro c = new Cachorro("lavrador", "Labrador");
        c.imprimeDados();
        c.Late();
        Gato g = new Gato ("Gatin", "Siamês");
        g.imprimeDados();
        g.mia();
        
    }
    
}
