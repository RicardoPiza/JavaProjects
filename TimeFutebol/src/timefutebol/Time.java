/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timefutebol;

import java.util.Scanner;

/**
 *
 * @author aewvs
 */
public class Time {
    Scanner lernomes = new Scanner(System.in);
    private Jogador jogadores[];
    private Jogador substituicao[];

    public Scanner getLernomes() {
        return lernomes;
    }

    public void setLernomes(Scanner lernomes) {
        this.lernomes = lernomes;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getSubstituicao() {
        return substituicao;
    }

    public void setSubstituicao(Jogador[] substituicao) {
        this.substituicao = substituicao;
    }

    public Time(Jogador[] jogadores) {
        this.jogadores = jogadores;
        jogadores = new Jogador[11];
        
        
        
    }
  

    
    
}
