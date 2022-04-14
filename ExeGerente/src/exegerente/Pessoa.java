/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exegerente;

/**
 *
 * @author aewvs
 */
public class Pessoa {
    public String nome;
    public String nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    public void imprimeDados(){
    }
}
