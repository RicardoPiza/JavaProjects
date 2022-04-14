/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exehosp;

/**
 *
 * @author jota02
 */
public class ExeHosp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prontuario p = new Prontuario(1);
        p.CadastraPaciente();
        p.CadastraMédico();
        p.CadastraOcorrencia();
    }
    
}
