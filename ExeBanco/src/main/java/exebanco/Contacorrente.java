/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exebanco;

/**
 *
 * @author aewvs
 */
public class Contacorrente {
    private String numero;
    private double saldo;
    private String status;
    private double limite;
    private int indice;
    private Movimentacao movimentacoes[];

    public Contacorrente() {            //polimorfismo
        movimentacoes = new Movimentacao[10];
        saldo = 0;
        indice = 0;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void deposito(String descricao, double valor) {
        Movimentacao dep = new Movimentacao();
        dep.setDescricao(descricao);
        dep.setValor(valor);
        dep.setTipo("Crédito");
        movimentacoes[indice] = new Movimentacao();
        movimentacoes[indice] = dep;
        indice++;
        saldo = saldo + valor;
    }
    
    public void saldo(){
        System.out.println("Saldo: " + saldo);        
    }
    public void extrato(){
        System.out.println ("Extrato da conta corrente");
        for(int i = 0; i<movimentacoes.length;i++) {
            if(movimentacoes[i] != null)
            System.out.println(movimentacoes[i].getDescricao() + " - " + movimentacoes[i].getValor() + " - " + movimentacoes[i].getTipo());
            System.out.println("------------------------");
            {
        System.out.println("Saldo: " + saldo);
        }                   
    }
    }
    public void saque(String descricao, double valor) {
        if (saldo >= valor){
        Movimentacao saq = new Movimentacao();
        saq.setDescricao(descricao);
        saq.setValor(valor);
        saq.setTipo("Débito");
        movimentacoes[indice] = new Movimentacao();
        movimentacoes[indice] = saq;
        indice++;
        saldo = saldo - valor;
    }
     else
        System.out.println("Saldo insuficiente");
    }
}
