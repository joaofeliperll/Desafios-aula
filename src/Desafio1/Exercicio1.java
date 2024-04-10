package Desafio1;


import javax.swing.*;


public class Exercicio1 {
    

 
    // EXERCÍCIO 1 - IF, ELSE IF E ESLE
    public void verificacaoDeNumero(double numero){
        if(numero == 0){
            JOptionPane.showMessageDialog(null, "NÚMERO NEUTRO!");
        } else if(numero > 0){
            JOptionPane.showMessageDialog(null, "NÚMERO POSITIVO!");
        } else if(numero < 0){
            JOptionPane.showMessageDialog(null, "NÚMERO NEGATIVO!");
        } else{
            JOptionPane.showMessageDialog(null, "ÍNDICE INVÁLIDO!");
        }
    }

    public void funcaoSwitch(int numero1){
        switch (numero1){
            case 1:
            JOptionPane.showMessageDialog(null, DiasDaSemana.DOMINGO);
            break;
            case 2:
            JOptionPane.showMessageDialog(null, DiasDaSemana.SEGUNDA);
            break;
            case 3:
            JOptionPane.showMessageDialog(null, DiasDaSemana.TERÇA);
            break;
            case 4:
            JOptionPane.showMessageDialog(null, DiasDaSemana.QUARTA);
            break;
            case 5:
            JOptionPane.showMessageDialog(null, DiasDaSemana.QUINTA);
            break;
            case 6:
            JOptionPane.showMessageDialog(null, DiasDaSemana.SEXTA);
            break;
            case 7:
            JOptionPane.showMessageDialog(null, DiasDaSemana.SÁBADO);
            break;
        }
    }

    // EXERCÍCIO 3 - ESTRUTURA DE REPETIÇÃO - FOR, WHILE, DO-WHILE
    public void estruturaDeRepeticao(int numero1){
        
        
        // FOR
        String mensagem = ""; // INICIALIZANDO A STRING
        for(int i = 0; i < numero1; i++){
        
            mensagem +=  i + "\n"; //CONTATENANDO A STRING VAZIA COM A VARIÁVEL I
        }
        JOptionPane.showMessageDialog(null, "Estrutura de repetição FOR: \n"+ mensagem);

        // WHILE
        mensagem = ""; //REINICIALIZANDO A STRING
        int i = 0; 
        while(i<numero1){
            
            mensagem += i + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, "Estrutura de repetição WHILE: \n"+ mensagem);

        // DO-WHILE

        mensagem = "";
        i = 0;
        do{
            
            mensagem += i + "\n";
            i++;
        } while(i <numero1);
        JOptionPane.showMessageDialog(null,"Estrutura de repetição DO-WHILE: \n"+ mensagem);

        
    }
    
}