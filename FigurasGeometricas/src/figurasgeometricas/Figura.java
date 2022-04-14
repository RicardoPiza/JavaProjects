/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author aewvs
 */
public class Figura {
    int lado1;
    int lado2;
    int lado3;
    int raio;
    String tipo;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void Figura(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        if(lado1 == lado2){
            System.out.println("Quadrado");            
        }
        else {
            System.out.println("Retângulo");
        }
    }

    public Figura(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilátero");            
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
            System.out.println("Isóceles");
        }
        else {
            System.out.println("Escaleno");
        }
    }

    public Figura(int raio) {
        this.raio = raio;
        this.tipo = "Circulo";
        System.out.println("Circulo");
    }
    
}
