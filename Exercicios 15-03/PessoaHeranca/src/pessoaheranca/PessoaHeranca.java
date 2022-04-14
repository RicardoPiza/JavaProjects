/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoaheranca;

/**
 *
 * @author aewvs
 */
public class PessoaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Miseravel m = new Miseravel("Givaldo Alves", 48);
        m.Mendiga();
        System.out.println("Nome: " + m.nome);
        System.out.println("Idade: " + m.idade);
        Pobre p = new Pobre ("Ricardo Piza", 34);
        p.trabalha();
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        Rica r = new Rica (10000000.00 ,"Jeff Bezos", 58);
        r.fazCompras();
        System.out.println("Nome: " + r.nome);
        System.out.println("Idade: " + r.idade);       
    }
    
}
