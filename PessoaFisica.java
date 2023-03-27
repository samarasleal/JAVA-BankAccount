/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulanoite;

import java.util.ArrayList;

/**
 *
 * @author samara
 */
public class PessoaFisica extends Pessoa{
    
    private int cpf;
    
    public PessoaFisica(int cpf, String nome, ArrayList<Conta> listaConta){
        super(nome, listaConta);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
        
}
