package Desafio3;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;
    private double porcetage;

    Servicos servicos = new Servicos();
    Scanner sc = new Scanner(System.in);

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa(){
        return taxa;
    }
    public void setTaxa(double taxa){
        this.taxa = taxa; 
    }

    public double getPorcetage(){
        return porcetage;
    }
    
    public void setPorcetage(double porcetage){
        this.porcetage = porcetage;
    }
    public Funcionario(){

    }
    
    public Funcionario(String nome, double salarioBruto, double taxa){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String toString() {
        return "NOME: " + getNome() + "\nSALÁRIO ATUAL: "
         + getSalarioBruto() + "\nTAXA: " + getTaxa()+ "\n -------Dados do usuário-------";
    }


    // METÓDOS PARA IMPRIMIR DADOS DO FUNCIONÁRIO

    public void imprimirDadosFuncionario(){
        
        
        System.out.println("Digite o nome do primeiro funcionário: ");
        setNome(sc.nextLine());

        System.out.println("Digite o salário bruto do primeiro funcionário: ");
        setSalarioBruto(sc.nextDouble());

        System.out.println("Digite a taxa de imposto do primeiro funcionário: ");
        setTaxa(sc.nextDouble());

        
    }
    public void imprimirDadosFuncionario2(){
        
        System.out.println("Digite o nome do segundo funcionário: ");
        setNome(sc.nextLine());

        System.out.println("Digite o salário bruto do segundo funcionário: ");
        setSalarioBruto(sc.nextDouble());

        System.out.println("Digite a taxa de imposto do segundo funcionário: ");
        setTaxa(sc.nextDouble());

        sc.close();
    }

    public void imprimirAumentoFuncionario(){
        System.out.println("O Funcionário 1 - " + getNome() + ", receberá um aumento de 10% do seu salário bruto, seu salário bruto é: "+ 
        getSalarioBruto() + " ,portanto com o aumento, seu salário ficou: " + servicos.aumentoSalario(getSalarioBruto()));
    }
    public void imprimirDadosAtualizados(){
        
        System.out.println("FUNCIONÁRIO : " + getNome() + "\nSALÁRIO ATUAL: " + servicos.aumentoSalario(getSalarioBruto()) + "\nTAXA DE IMPOSTO: "+ getTaxa()+"\n");
        
        
    }
    public void imprimirSalarioLiquido(){
        System.out.println("\nSALÁRIO LÍQUIDO DO FUNCIONÁRIO :" + servicos.obterSalarioLiquido(getSalarioBruto(), getTaxa()));
        
    }


}
