/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehosp;

/**
 *
 * @author jota02
 */
public class Medico extends Pessoa{
    public String crm;
    public String esp;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public Medico(String crm, String esp, String nome, String cpf, String tel, String end) {
        super(nome, cpf, tel, end);
        this.crm = crm;
        this.esp = esp;
    }


}
