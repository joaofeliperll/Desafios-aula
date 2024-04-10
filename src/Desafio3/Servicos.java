package Desafio3;

public class Servicos {
    

    public double obterSalarioLiquido(double salarioBruto, double taxa){
        return salarioBruto - ( salarioBruto/ taxa);
    }
    public double aumentoSalario(double salarioBruto){
        return salarioBruto + (salarioBruto /10);

    }
    
    
    
}
