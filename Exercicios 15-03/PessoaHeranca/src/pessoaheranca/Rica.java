/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoaheranca;

/**
 *
 * @author aewvs
 */
public class Rica extends Pessoa{
    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Rica(double dinheiro, String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras(){
        System.out.println("O rico está fazendo compras");
    }
}
