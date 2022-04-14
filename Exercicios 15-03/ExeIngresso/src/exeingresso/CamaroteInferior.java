/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exeingresso;

/**
 *
 * @author aewvs
 */
public class CamaroteInferior extends Vip{
    public String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteInferior(String localizacao) {
        this.localizacao = localizacao;
    }
    public void Acessar(){
        System.out.println("Acesso pelo corredor 2");
    }
}
