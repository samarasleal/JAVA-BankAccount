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
public class PessoaJuridica extends Pessoa{
    private int cpnj;
    
    public PessoaJuridica(int cnpj, String nome, ArrayList<Conta> listaConta){
        super(nome, listaConta);
        this.cpnj = cnpj;
    }

    public int getCpnj() {
        return cpnj;
    }
    
    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }
    
}
