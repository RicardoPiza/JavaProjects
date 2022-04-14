/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exehospital;

import java.util.ArrayList;


/**
 *
 * @author aewvs
 */
public class ExeHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Paciente p =new Paciente("Ricardo","232.435.453-54","(11) 921721879","AV. José de almeida");
        ArrayList<Paciente> listaPacientes = new ArrayList();
        listaPacientes.add(p);
        System.out.println("Paciente: "+p.getNome()+"\nCPF: "+p.getCpf()+"\nTelefone: "+p.getTelefone()
        + "\nEndereço: " +p.getEndereco());
                
        System.out.println("\n-----------------------------------------------");
        
        Medico m = new Medico("123234-93","Ortopedista","Paulo Oliveira","456.865.324-09", "(11) 982388712", "Rua Azevedo Souza");
        ArrayList<Medico> listaMedicos = new ArrayList();
        listaMedicos.add(m);
        System.out.println("\nMédico: " + m.getNome()+"\nCPF: "+ m.getCpf()+"\nTelefone: "
        +m.getTelefone()+"\nEndereço: "+m.getEndereco()+"\nCRM: "+m.getCrm()+"\nEspecialidade: "+m.getEspecialidade());
        
        System.out.println("\n-----------------------------------------------");
        
        
        ArrayList<Ocorrencias> listaOcorrencias = new ArrayList();
        Ocorrencias o = new Ocorrencias (1, "21/12/2011","14:22","Unimed","Paulo Oliveira");
        listaOcorrencias.add(o);
        System.out.println("\nCódigo: "+o.getCodigo()+"\nData: "+ o.getData()+"\nHora: "+o.getHora()+
        "\nConvênio: "+o.getConvenio()+"\nMédico responsável: "+ o.getMedresp());
        
}

    }
 
   