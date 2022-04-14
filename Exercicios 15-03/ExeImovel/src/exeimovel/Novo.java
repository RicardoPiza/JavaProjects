/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeimovel;

/**
 *
 * @author aewvs
 */
public class Novo extends Imovel {
    public double vadicional = preco + (preco * 0.1) ;

    public double getVadicional() {
        return vadicional;
    }

    public void setVadicional(double vadicional) {
        this.vadicional = vadicional;
    }

    public Novo(double vadicional, double preco, String endereco) {
        super(preco, endereco);
        this.vadicional = vadicional;
    }
    @Override
    public void imprimeValor(){
        System.out.println("Valor adicional de 10%: " + vadicional);
    }
}
