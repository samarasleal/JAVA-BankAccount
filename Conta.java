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
public class Conta {
    // Atributos
    private int numero;
    private double saldo = 0;
    private Agencia agencia;
    // Métodos 
    // Método Construtor
    public Conta(int num, Agencia ag){
        this.numero = num;
        this.agencia = ag;
    }
    // Métodos getters e setters
    // get: Obtem o valor do atributo
    // set: Alterar o valor do atributo
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }
    public Agencia getAgencia(){
        return this.agencia;
    }
    public void setAgencia(Agencia novoAgencia){
        this.agencia = novoAgencia;
    }
    // Outro Métodos
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    public void sacar(double valor){
        if (valor<=this.saldo)
            this.saldo = this.saldo - valor;
    }
}
