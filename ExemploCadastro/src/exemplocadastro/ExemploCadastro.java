/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplocadastro;

/**
 *
 * @author aewvs
 */
public class ExemploCadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*
	Programando em JAVA
*/
 
package javaficha;
 
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class JavaFicha {
    private static String nome;
    private static int idade;
    private static float altura;
    private static float peso;
    private static char sexo;
 
    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
 
         do{
            System.out.println("Digite seu nome: ");
            nome = leitura.nextLine();
         }while(nome.length() <  6 || nome.length() > 30);
 
         do{
            System.out.println("Digite sua idade: ");
            idade = leitura.nextInt();
         }while(idade <= 0  || idade >= 100);
 
         do{
             System.out.println("Digite sua altura: ");
             altura = leitura.nextFloat();
         }while(altura <= 0);
 
         do{
             System.out.println("Digite seu peso: ");
             peso = leitura.nextFloat();
         }while(peso <= 0);
 
         do{
             try {
                 System.out.println("Digite seu sexo: F ou M");
                 sexo = (char) System.in.read();
             } catch (IOException ex) {
                 Logger.getLogger(JavaFicha.class.getName()).log(Level.SEVERE, null, ex);
             }
         }while(sexo != 'F' && sexo != 'M');
 
         System.out.println("\nNome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Altura: " + altura);
         System.out.println("Peso: " + peso);
         System.out.println("Sexo: " + sexo);
    }
 
}