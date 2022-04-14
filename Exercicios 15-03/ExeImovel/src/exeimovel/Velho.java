/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeimovel;

/**
 *
 * @author aewvs
 */
public class Velho extends Imovel {
    public double desconto = preco - (preco * 0.1);

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Velho(double desconto, double preco, String endereco) {
        super(preco, endereco);
        this.desconto = desconto;
    }
    @Override
    public void imprimeValor(){
        System.out.println("Valor do imóvel velho com desconto de 10%: " + desconto);
    }    
}
