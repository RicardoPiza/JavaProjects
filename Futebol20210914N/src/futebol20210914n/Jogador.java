/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol20210914n;

import java.util.Scanner;

/**
 *
 * @author spetr
 */
public class Jogador {
    private String nome;
    private int numero;
    private String posTatica;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.setPosTatica();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosTatica() {
        return posTatica;
    }

    public void setPosTatica() {
        System.out.println("Escolha a posição:"
                + "[1] Goleiro;"
                + "[2] Zagueiro;"
                + "[3] Lateral;"
                + "[4] Meia;"
                + "[5] Atacante.");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        switch(pos)
        {
            case 1:
                this.posTatica = "Goleiro";
                break;
            case 2:
                this.posTatica = "Zagueiro";
                break;
            case 3:
                this.posTatica = "Lateral";
                break;
            case 4:
                this.posTatica = "Meia";
                break;
            case 5:
                this.posTatica = "Atacante";
                break;
        }
    }
    
    public void status()
    {
        System.out.println("Número: " + this.numero);
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição tática: " + this.posTatica);
    }
  
}
