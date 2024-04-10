package Desafio4;
import javax.swing.*;
public class Main{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Conta Bancária", "Bem-vindo a Conta Bancária!", JOptionPane.OK_OPTION);
        ContaBancaria conta = new ContaBancaria();
        ContaService service = new ContaService();
        

        
        String nomeDoTitular = JOptionPane.showInputDialog("Digite seu nome titular da conta:");

        
        String numeroDoTitularInput = JOptionPane.showInputDialog("Digite o número do titular da conta:");
        int numeroDoTitular = Integer.parseInt(numeroDoTitularInput);

        
        String opcaoDepositoInicial = JOptionPane.showInputDialog("Deseja iniciar um depósito inicial? (s/n)");
        
        if(opcaoDepositoInicial.equalsIgnoreCase("s")){
            String depositoInicialInput = JOptionPane.showInputDialog("Dejesa quanto deseja depositar inicialmente: ");
            double depositoInicial = Double.parseDouble(depositoInicialInput);
            
            conta = new ContaBancaria(nomeDoTitular, numeroDoTitular, depositoInicial);
        } else{
            JOptionPane.showMessageDialog(null,"Você não deseja iniciar depositando!");
            conta = new ContaBancaria(nomeDoTitular, numeroDoTitular);
        }


        
        
        JOptionPane.showMessageDialog(null, "Conta criada para: " + conta.getNomeDoTitular() + ", seu número da conta: " + conta.getNumeroDoTitular() + ", e seu saldo atual é: " + conta.getSaldo() );

        String valorInput = JOptionPane.showInputDialog("Digite quanto você deseja depositar:");
        double valor = Double.parseDouble(valorInput);
        service.depositar(conta, valor);
        


        String valor1Input = JOptionPane.showInputDialog("Digite quanto você quer sacar, seu saldo é de: " + conta.getSaldo());
        double valor1 = Double.parseDouble(valor1Input);
        service.saque(conta, valor1);

        JOptionPane.showMessageDialog(null, "Conta de: " + conta.getNomeDoTitular() + ", seu número da conta: " + conta.getNumeroDoTitular() + ", e seu saldo atual é: " + conta.getSaldo() );

        
    }

}