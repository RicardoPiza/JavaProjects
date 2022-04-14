/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exepoligono;

/**
 *
 * @author aewvs
 */
public class ExePoligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(2);
        Triangulo t = new Triangulo();
        t.setAltura(20);
        t.setBase(21);
        Retangulo r = new Retangulo();
        r.setAltura(21);
        r.setBase(12);
        PoligonoComplexo pc = new PoligonoComplexo();
        pc.insere(c);
        System.out.println("O Total das áreas é: " + pc.area());
        
    }
    
}
