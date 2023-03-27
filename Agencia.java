/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulanoite;

/**
 *
 * @author samara
 */
public class Agencia {
    private int numero;
    public Agencia(int num){
        this.numero = num;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }
}
