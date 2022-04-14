/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehospital;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author aewvs
 */
public class Prontuario {
    public Paciente p;
    public Ocorrencias o;
    public Medico m;

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }

    public Ocorrencias getO() {
        return o;
    }

    public void setO(Ocorrencias o) {
        this.o = o;
    }

    public Medico getM() {
        return m;
    }

    public void setM(Medico m) {
        this.m = m;
    }

    public Prontuario(Paciente p, Ocorrencias o, Medico m) {
        this.p = p;
        this.o = o;
        this.m = m;
    }
    public void Status(){
      
    }

}
