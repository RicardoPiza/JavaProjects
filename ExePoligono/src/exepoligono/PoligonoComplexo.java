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
public class PoligonoComplexo {

    private Poligono[] lista;
    private int cont;

    public PoligonoComplexo() {
        lista = new Poligono[10];
        cont = 0;
    }
    
    public void insere(Poligono x){
        lista[cont] = x;
        cont++;   
     }
    public double area(){   
        double areaTotal = 0;
        for (int i=0; i<cont; i++){
            areaTotal = areaTotal + lista[i].calculoArea();
    }
        return areaTotal;
    }
}
