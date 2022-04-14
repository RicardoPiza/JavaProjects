/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepoligono;

import static java.lang.Math.pow;

/**
 *
 * @author aewvs
 */
public class Circulo extends Poligono {
    public double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    @Override
    public double calculoArea() {
        return 3.14*pow(raio,2);
           
    }
   
   
    
}
