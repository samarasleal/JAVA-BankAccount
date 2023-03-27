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
public class ContaCorrente extends Conta{
    private double salario;
    public ContaCorrente(double sal, int  numero, Agencia ag){
        super(numero, ag);
        this.salario = sal;
    }
    public void setSalario(double novoSal){
        this.salario = novoSal;
    }
    public double getSalario(){
        return this.salario;
    }
    public void imprimirSalario(){
        System.out.println("O salario é: "+getSalario());
    }
}
