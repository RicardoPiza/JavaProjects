/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehospital;

/**
 *
 * @author aewvs
 */
public class Medico extends Pessoa {
    public String crm;
    public String especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Medico(String crm, String especialidade, String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
  

}
