/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes;

import java.util.*;

/**
 *
 * @author aewvs
 */
public class Clientes {
   
     public static void main (String [] args) {
    
    /*Cliente c1 = new Cliente ();
    c1.setNome("João");
    c1.setCpf("123.456.789-10");
    c1.setTelefone("4524-1232");
    c1.setLogradouro("Rua Campinas");
    c1.setNum("14");
    c1.setBairro("Jd. Rosa");
    c1.setCidade("Itatiba");
    c1.setEstado("São Paulo");
    c1.status();*/
    
    ArrayList<Cliente> listaClientes = new ArrayList();
    int codigo = 0;
    Scanner sc = new Scanner (System.in);
    do {     
        System.out.print("Digite o código: ");
        codigo = sc.nextInt();
        sc.nextLine(); // Descartar o enter
        if(codigo != 0);{
            Cliente c = new Cliente ();
            System.out.print("Código: ");
            c.setCodigo(codigo);
            System.out.print("Nome: ");
            c.setNome(sc.nextLine());
            System.out.print("CPF: ");
            c.setCpf(sc.nextLine());
            System.out.print("Telefone: ");
            c.setTelefone(sc.nextLine());
            System.out.print("Logradouro: ");
            c.setLogradouro(sc.nextLine());
            System.out.print("Número: ");
            c.setNum(sc.nextLine());
            System.out.print("Bairro: ");
            c.setBairro(sc.nextLine());
            System.out.print("Cidade: ");
            c.setCidade(sc.nextLine());
            System.out.print("Estado: ");
            c.setEstado(sc.nextLine());  
            listaClientes.add(c);
        }
        
    } while (codigo != 0);
         
    Cliente c;
    
    Iterator<Cliente> it = listaClientes.iterator();
    while (it.hasNext()) {
        c = it.next();
        c.status();
        System.out.println("--------------------");
        System.out.println("Código: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
    }
     /*Cliente c = listaClientes.get (0);
     System.out.println(c.getNome());*/
    
}
}