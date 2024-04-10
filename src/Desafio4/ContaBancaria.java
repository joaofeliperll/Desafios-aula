package Desafio4;



public class ContaBancaria{
    private String nomeDoTitular;
    private int numeroDoTitular;
    private double saldo;

    
    public ContaBancaria(){}

    public ContaBancaria(String nomeDoTitular, int numeroDoTitular, double saldo){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoTitular = numeroDoTitular;
        this.saldo = saldo;
    }
    public ContaBancaria(String nomeDoTitular, int numeroDoTitular){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDoTitular = numeroDoTitular;
        this.saldo = 0.0;
    }
    
    
    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
  

    public int getNumeroDoTitular(){
        return numeroDoTitular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    } 
    

}







