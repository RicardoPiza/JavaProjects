/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exegerente;

/**
 *
 * @author aewvs
 */
public class Gerente extends Funcionario {
    public double impostog = imposto + (imposto * 0.02);

    public double getImpostog() {
        return impostog;
    }

    public void setImpostog(double impostog) {
        this.impostog = impostog;
    }
    @Override
    public void imprimeDados(){
        System.out.println("");
    }
}
