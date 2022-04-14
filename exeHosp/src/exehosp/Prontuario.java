/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehosp;

import java.util.ArrayList;

/**
 *
 * @author jota02
 */
public class Prontuario {
    public int cod;
    public ArrayList<Medico> ListaMed = new ArrayList();
    public ArrayList<Paciente> ListaPac = new ArrayList();
    public ArrayList<Ocorrencia> ListaOc = new ArrayList();

    public ArrayList<Ocorrencia> getListaOc() {
        return ListaOc;
    }

    public void setListaOc(ArrayList<Ocorrencia> ListaOc) {
        this.ListaOc = ListaOc;
    }

    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ArrayList<Medico> getListaMed() {
        return ListaMed;
    }

    public void setListaMed(ArrayList<Medico> ListaMed) {
        this.ListaMed = ListaMed;
    }

    public ArrayList<Paciente> getListaPac() {
        return ListaPac;
    }

    public void setListaPac(ArrayList<Paciente> ListaPac) {
        this.ListaPac = ListaPac;
    }

    public Prontuario(int cod) {
        this.cod = cod;
    }

   
    public void CadastraPaciente(){
        Paciente p = new Paciente("Ricardo","123.456.789-99","(11) 998754524","Av. Jose Almeida, n 890");
        ListaPac.add(p);
            System.out.println("Paciente");
            System.out.println("Nome: " + p.getNome());
            System.out.println("CPF: " + p.getCpf());
            System.out.println("Endereço: " + p.getEnd());
            System.out.println("Telefone: " + p.getTel());
            System.out.println("----------------------------");
    }
        public void CadastraMédico(){
        Medico m = new Medico ("123234-93","Ortopedista","Paulo Oliveira","456.865.324-09", "(11) 982388712", "Rua Azevedo Souza");
        ListaMed.add(m);
            System.out.println("Médicos responsáveis:");
            System.out.println("Nome: " + m.getNome());
            System.out.println("CPF: " + m.getCpf());
            System.out.println("Endereço: " + m.getEnd());
            System.out.println("Telefone: " + m.getTel());
            System.out.println("CRM: " + m.getCrm());
            System.out.println("Especialidade: " + m.getEsp());
            System.out.println("----------------------------");
        Medico m2 = new Medico ("47723-11","Cardiologista","Henrique Santos","476.467.774-22", "(11) 42727247", "Rua Agenor Campos");
        ListaMed.add(m2);            
            System.out.println("Nome: " + m2.getNome());
            System.out.println("CPF: " + m2.getCpf());
            System.out.println("Endereço: " + m2.getEnd());
            System.out.println("Telefone: " + m2.getTel());
            System.out.println("CRM: " + m2.getCrm());
            System.out.println("Especialidade: " + m2.getEsp());
            System.out.println("----------------------------");
            
    }
        public void CadastraOcorrencia(){
        Ocorrencia oc = new Ocorrencia(1,"10/08/2022","12:52","Unimed","Paulo Oliveira");
        ListaOc.add(oc);
            System.out.println("Ocorrêncas:");
            System.out.println("Código : " + oc.getCodigo());
            System.out.println("Data: " + oc.getData());
            System.out.println("Hora: "+oc.getHora() );
            System.out.println("Convenio: " + oc.getConvenio());
            System.out.println("Médico Responsável: " + oc.getMedresp());
            
        }
}
