package Desafio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;




public class ServicosTarefa{

    public ServicosTarefa(){
        
    }

    private int opcao;
    private String tarefa;
    private int indiceRemover;

    public int getOpcao(){
        return opcao;
    }

    public void setOpcao(int opcao){
        this.opcao = opcao;
    }

    public String getTarefa(){
        return tarefa;
    }
    
    public void setTarefa(String tarefa){
        this.tarefa = tarefa;
    }

    public int getIndiceRemover(){
        return indiceRemover;
    }
    public void setIndiceRemover(int indiceRemover){
        this.indiceRemover = indiceRemover;
    }

    
    

    ArrayList<String> tarefas = new ArrayList<>(); 

    

    public void adicionarTarefa(String tarefa){ 
        if(tarefas.contains(getTarefa())){
            JOptionPane.showMessageDialog(null, "Tarefa já existente, por favor insira uma nova tarefa!");
        }else{
        tarefas.add(getTarefa());
        String mensagem = "";
        for(int i = 0; i < tarefas.size(); i++){
            mensagem += (i+1) + "- " + tarefas.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tarefa: " + getTarefa() + " adicionada com sucesso! \n" + mensagem);
        }
        
    }

    public void visuzalizarTarefas(){
        String mensagem = "";
        if(tarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "A lista de tarefas está vazia!");
        } else{
            for(int i = 0; i < tarefas.size(); i++){
                mensagem += (i+1) + "- " + tarefas.get(i) + "\n";
            }
        
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

    public void removerTarefa(int indiceRemover){
        if(tarefas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ainda não há itens na lista para remover!");
        } else if (getIndiceRemover() >= 1 && getIndiceRemover() <= tarefas.size()){
            tarefas.remove(getIndiceRemover()-1);
            JOptionPane.showMessageDialog(null, "Tarefa seleciada removida com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Índice inválido! Tente novamente");
        }
    }

    public void menuDeTarefas(){
     
        do{
            
            String [] opcoes  = {"Adicionar Tarefas", "Remover Tarefas", "Visualizar Tarefas", "Sair"};

            setOpcao(JOptionPane.showOptionDialog(null, "Escolha uma das opções", "Lista de Tarefas",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]));

        switch (getOpcao()) {
            case Opcoes.ADICIONAR:
            setTarefa(JOptionPane.showInputDialog("Digite a tarefa que deseja adicionar: "));
            adicionarTarefa(getTarefa());
            break;

            case Opcoes.REMOVER:
            setIndiceRemover(Integer.parseInt(JOptionPane.showInputDialog("Digite o índice que deseja remover: ")));  
            removerTarefa(getIndiceRemover());
            break;

            case Opcoes.VISUALIZAR:
            visuzalizarTarefas();
            break;
        }

        }while(getOpcao() != Opcoes.SAIR);
        JOptionPane.showMessageDialog(null, "Finalizando programa!...");
    
        
        }
        public String toString() {
            return "ServicosTarefa{" +
                    "opcao=" + opcao +
                    ", tarefa='" + tarefa + '\'' +
                    ", indiceRemover=" + indiceRemover +
                    ", tarefas=" + tarefas +
                    '}';
    }
    
}
