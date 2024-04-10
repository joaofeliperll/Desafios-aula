package Desafio4;
import javax.swing.*;

public class ContaService {
    public void saque(ContaBancaria conta, double valor) {
        if (valor > conta.getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque!");
        } else {
            conta.setSaldo((conta.getSaldo() - valor) - 5);
            JOptionPane.showMessageDialog(null, "Saque de " + valor + " efetuado na sua conta. Valor atualizado: " + conta.getSaldo());
        }
    }

    public void depositar(ContaBancaria conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        JOptionPane.showMessageDialog(null, "Depósito de " + valor + " realizado com sucesso! Valor atualizado para: " + conta.getSaldo());
    }
}
