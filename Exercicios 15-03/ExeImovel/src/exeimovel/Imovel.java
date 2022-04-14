/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeimovel;

/**
 *
 * @author aewvs
 */
public class Imovel {
    public double preco;
    public String endereco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }
    
    public void imprimeValor(){
        System.out.println("Valor do imóvel: " + preco);
    } 
}
