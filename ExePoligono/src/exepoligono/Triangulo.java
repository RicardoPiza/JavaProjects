/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepoligono;

/**
 *
 * @author aewvs
 */
public class Triangulo extends Poligono{
    public double base;
    public double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calculoArea() {
        return (base * altura) / 2;
        
    }
    
}
