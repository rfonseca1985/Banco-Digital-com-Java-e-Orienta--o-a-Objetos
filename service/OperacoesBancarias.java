package service;
import model.ContaBancaria;

public class OperacoesBancarias {
    

    public static void sacar(ContaBancaria conta, double valor) {
        if (valor > 0 && valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
    }
    
    public static void depositar(ContaBancaria conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Não foi possível realizar o depósito. Valor inválido.");
        }
    }
    
    public static void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= origem.getSaldo()) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
            System.out.println("Saldo da Conta Origem: R$" + origem.getSaldo());
            System.out.println("Saldo da Conta Destino: R$" + destino.getSaldo());
        } else {
            System.out.println("Não foi possível realizar a transferência. Valor inválido ou saldo insuficiente na conta de origem.");
        }
    }
    public static void consultarSaldo(ContaBancaria conta) {
        System.out.println("Saldo da Conta " + conta.getNumeroConta() + ": R$" + conta.getSaldo());
    }
    
    
    }
