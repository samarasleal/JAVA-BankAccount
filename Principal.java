
package aulanoite;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Criando uma agencia: ");
        System.out.println("Informe o número da agencia: ");
        int numAgencia = entrada.nextInt();
        
        Agencia ag = new Agencia(numAgencia);
        System.out.println("O numero da agencia criada é: "+ag.getNumero());
        
        System.out.println("\nCriando conta corrente: ");
        System.out.println("Informe o numero da conta corrente: ");
        int numCC = entrada.nextInt();
        System.out.println("Informe o seu salario: ");
        double salario = entrada.nextDouble();

        
        ContaCorrente cc = new ContaCorrente(salario, numCC, ag);
        System.out.println("O numero da conta corrente é: "+cc.getNumero());
        
        System.out.println("\nCriando conta poupança: ");
        System.out.println("Informe o número da conta poupança: ");
        int numCP = entrada.nextInt();
        System.out.println("Informe o rendimento da conta poupança: ");
        double rendimento = entrada.nextDouble();
        
        ContaPoupanca cp = new ContaPoupanca(rendimento, numCP, ag);
        System.out.println("O numero da conta poupança é: "+cp.getNumero());
        
        System.out.println("\nCriando uma pessoa jurídica: ");
        System.out.println("Informe o seu cnpj: ");
        int cnpj = entrada.nextInt();
        System.out.println("Informe o seu nome: ");
        String nome = entrada.next();
        ArrayList<Conta> listaConta = new ArrayList<Conta>();
        
        PessoaJuridica pj = new PessoaJuridica(cnpj, nome, listaConta);
        pj.setListaConta(cc);
        pj.setListaConta(cp);
        
        for (int i=0; i < pj.getListaConta().size();i++){
            System.out.println("A pessoa tem a conta de numero: "+pj.getListaConta().get(i).getNumero());
        }
               
    }  
}
