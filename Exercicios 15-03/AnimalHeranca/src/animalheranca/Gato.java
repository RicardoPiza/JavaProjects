/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalheranca;

/**
 *
 * @author aewvs
 */
public class Gato extends Animal{

    public Gato(String nome, String raca) {
        super(nome, raca);
    }
    public void mia() {
        System.out.println("Miau!");
    }
}
