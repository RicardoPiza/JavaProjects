/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exeimovel;

/**
 *
 * @author aewvs
 */
public class ExeImovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imovel i = new Imovel(300000.00, "Alameda São Pedro, n º 122");
        System.out.println("Endereço: " + i.endereco);
        i.imprimeValor();
        System.out.println("---------------------------------");
        Novo n = new Novo (i.preco + (i.preco * 0.1), 300000.00, "Rua José Jorge Antônio, nº 908");
        n.imprimeValor();
        System.out.println("Endereço: " + n.endereco);
        System.out.println("---------------------------------");
        Velho v = new Velho (i.preco - (i.preco * 0.1), 300000.00, "Av. Amaral Junior, nº 12");
        v.imprimeValor();
        System.out.println("Endereço: " + v.endereco);
    }
    
}
