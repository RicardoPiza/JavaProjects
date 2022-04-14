/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exebanco;

/**
 *
 * @author aewvs
 */
public class Movimentacao {
    private String descricao;
    private double valor;
    private String tipo;
    
    public void setDescricao(String descricao){
        this.descricao = descricao + " - alterado";
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
