package Desafio3;


public class Main {
    public static void main(String[] args) {


        // IMPRIMINDO DADOS DO FUNCIONÁRIO 1
        Funcionario funcionario1= new Funcionario();

        funcionario1.imprimirDadosFuncionario();
        System.out.println(funcionario1);


        //IMPRIMINDO DADOS DO FUNCIONÁRIO 2
        Funcionario funcionario2 = new Funcionario();

        funcionario2.imprimirDadosFuncionario2();
        System.out.println(funcionario2);

        // IMPRIMINDO O AUMENTO DO FUNCIONÁRIO 1
        
        funcionario1.imprimirAumentoFuncionario();
        System.out.println("\n");
        
        //IMPRIMINDO OS DADOS ATUALIZADOS
        
        System.out.println("FUNCIONÁRIO 1");funcionario1.imprimirDadosAtualizados();
        System.out.println(" ");
        System.out.println("FUNCIONÁRIO 2");funcionario2.imprimirDadosAtualizados();
        System.out.println(" ");

        //IMPRIMINDO O SALÁRIO LÍQUIDO
        
        System.out.println("FUNCIONÁRIO 1"); funcionario1.imprimirSalarioLiquido();
        System.out.println("\n");
        
        System.out.println("FUNCIONÁRIO 2"); funcionario2.imprimirSalarioLiquido();
        System.out.println("\n");
    

        


        

        

        
    


        




        
       
    }
    
}
