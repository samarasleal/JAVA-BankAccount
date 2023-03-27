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
public class Pessoa {
    private String nome;
    private ArrayList<Conta> listaConta = new ArrayList<Conta>();
    
    public Pessoa(String nome, ArrayList<Conta> listaConta){
        this.nome = nome;
        this.listaConta = listaConta;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public ArrayList<Conta> getListaConta(){
        return this.listaConta;
    }
    
    public void setListaConta(Conta conta){
        this.listaConta.add(conta);
    }
}
