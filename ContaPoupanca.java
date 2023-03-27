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
public class ContaPoupanca extends Conta {
    private double rendimento;
    public ContaPoupanca(double rend, int numero, Agencia agencia){
        super(numero, agencia);
        this.rendimento = rend;
    }
    public double getRendimento(){
        return this.rendimento;
    }
    public void setRendimento(double novoRend){
        this.rendimento = novoRend;
    }
    
}
