/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futebol20210914n;

/**
 *
 * @author spetr
 */
public class Time {
    private Jogador[] jogadores;

    public Time() {
        jogadores = new Jogador[11];
    }
    
    public void defineJogador(int i, String nome, int numero){
        Jogador j = new Jogador(nome, numero);
        jogadores[i] = j;
    }
    
    public void substituiJogador(String nomeSai, String nomeEntra, int numeroEntra){
        int iSai=-1;
        for(int i=0;i<11;i++){
            if(jogadores[i]!=null){
                if(jogadores[i].getNome() == null ? nomeSai == null : jogadores[i].getNome().equals(nomeSai)){
                    iSai = i;
                }
                    
            }
                
        }
        if(iSai!=-1){
            this.defineJogador(iSai, nomeEntra, numeroEntra);
        }
        else
            System.out.println("Jogador a ser substituido não faz parte do time.");
        
    }
    
    public void mostraTime(){
        System.out.println("Nossos jogadores: ");
        for(int i=0;i<11;i++)
        {
           if(jogadores[i] != null){
               jogadores[i].status();
               System.out.println("----------------");
           } 
        }
    }
    
    
}
