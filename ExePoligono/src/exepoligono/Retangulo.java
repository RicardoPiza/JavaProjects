/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepoligono;

/**
 *
 * @author aewvs
 */
public class Retangulo extends Poligono {
    public double base;
    public double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public double calculoArea() {
        return base * altura;
        
    }
    
}
