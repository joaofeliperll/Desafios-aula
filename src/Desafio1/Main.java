package Desafio1;

import javax.swing.*;

public class Main {

    
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();


        // EXERCÍCIO 1 - IF, ELSE IF E ELSE

        String numeroInput = JOptionPane.showInputDialog("Digite um número: ");
        double numero = Double.parseDouble(numeroInput);
        exercicio1.verificacaoDeNumero(numero);

        // EXERCÍCIO 2 - USANDO SWITCH

        String numero1Input = JOptionPane.showInputDialog("Digite um número para o uso do switch: ");
        int numero1 = Integer.parseInt(numero1Input);
        exercicio1.funcaoSwitch(numero1);
        
        // EXERCÍCIO 3 - USANDO ESTRUTURA DE REPETIÇÃO 

        String numero2Input = JOptionPane.showInputDialog("Digite um número para inicializar a estrutura de repetição: ");
        int numero2 =  Integer.parseInt(numero2Input);
        exercicio1.estruturaDeRepeticao(numero2);
        



        
    }




}
