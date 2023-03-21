package ex1;

public class Funcionario {
    double salario;
    double aumentoPercentual;
    
    public double aumentaSalario(double salario, double aumento){
        aumentoPercentual = (aumento/100);
        salario = salario += salario*aumentoPercentual;
        return salario;
    }
}
