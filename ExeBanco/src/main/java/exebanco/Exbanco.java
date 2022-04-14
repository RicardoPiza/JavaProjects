/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exebanco;

/**
 *
 * @author aewvs
 */
public class Exbanco {
    
    public static void main (String [] args) {
        Movimentacao mv = new Movimentacao();
        mv.setDescricao ("pagamento x");
        System.out.println("Descrição: " + mv.getDescricao());
        
        Contacorrente cc = new Contacorrente();
        cc.deposito("Pagamento", 100);
        cc.saldo();
        cc.extrato();
        
    }
}
