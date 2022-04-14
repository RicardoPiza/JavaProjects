/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exehosp;

/**
 *
 * @author jota02
 */
public class Ocorrencia {
    public int codigo;
    public String data;
    public String hora;
    public String convenio;
    public String medresp;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getMedresp() {
        return medresp;
    }

    public void setMedresp(String medresp) {
        this.medresp = medresp;
    }

    public Ocorrencia(int codigo, String data, String hora, String convenio, String medresp) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.convenio = convenio;
        this.medresp = medresp;
    }
    
    
}
