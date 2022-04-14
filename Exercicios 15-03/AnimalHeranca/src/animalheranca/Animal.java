/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalheranca;

/**
 *
 * @author aewvs
 */
public abstract class Animal {
    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
    }
    
    
    
}
