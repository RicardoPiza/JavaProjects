/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.awt.*;
import java.util.*;


/**
 *
 * @author aewvs
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        Locale idioma = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        System.out.print("O idioma é: ");
        System.out.println(idioma.getDisplayLanguage());
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
        }
}
