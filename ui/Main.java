package ui;
import model.Cliente;
import model.ContaBancaria;
import service.OperacoesBancarias;

public class Main {
    

        public static void main(String[] args) {
            // Criação de clientes e contas bancárias
            Cliente cliente1 = new Cliente("Fulano", "123.456.789-00");
            ContaBancaria conta1 = new ContaBancaria(1001, cliente1, 1000.0);
    
            Cliente cliente2 = new Cliente("Ciclano", "987.654.321-00");
            ContaBancaria conta2 = new ContaBancaria(1002, cliente2, 500.0);
    
            // Realização de operações
            OperacoesBancarias.sacar(conta1, 200.0);
            OperacoesBancarias.depositar(conta2, 300.0);
            OperacoesBancarias.transferir(conta1, conta2, 150.0);
            OperacoesBancarias.consultarSaldo(conta1);
            OperacoesBancarias.consultarSaldo(conta2);
    
          
        }
    }

