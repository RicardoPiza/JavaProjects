/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exegerente;

/**
 *
 * @author aewvs
 */
public class Cliente extends Pessoa {
    public int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente(int codigo, String nome, String nascimento) {
        super(nome, nascimento);
        this.codigo = codigo;
    }
    @Override
    public void imprimeDados(){
    }
}
