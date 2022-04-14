/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehosp;

/**
 *
 * @author jota02
 */
public abstract class Pessoa {
    public String nome;
    public String cpf;
    public String tel;
    public String end;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Pessoa(String nome, String cpf, String tel, String end) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end;
    }
    
}
