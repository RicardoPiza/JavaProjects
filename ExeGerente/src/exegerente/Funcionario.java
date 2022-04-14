/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exegerente;

/**
 *
 * @author aewvs
 */
public class Funcionario extends Pessoa {
    public double salario;
    public double imposto = salario * 0.03;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Funcionario(double salario, String nome, String nascimento) {
        super(nome, nascimento);
        this.salario = salario;
    }
    
    @Override
    public void imprimeDados(){
        
    }
}
