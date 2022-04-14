/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaheranca;

/**
 *
 * @author aewvs
 */
public class Pobre extends Pessoa{

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    
    public void trabalha(){
        System.out.println("O pobre está trabalhando");
    }
}
