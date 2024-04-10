package Desafio2;

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao programa de listas de tarefas!");

        ServicosTarefa listadeTarefas = new ServicosTarefa();
        
        listadeTarefas.menuDeTarefas();
    }

}
