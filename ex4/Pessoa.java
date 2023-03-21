package ex4;

public class Pessoa {
    String nome = "";
    int diaNasc = 0;
    int mesNasc = 0;
    int anoNasc = 0;
    int idade = 0; 
    
    public String calculoIdade(String nomePessoa, int dia, int mes, int ano){
        nome = nomePessoa;
        if(mes>3){
            idade = 2023 - ano - 1;
        } else if(mes==3 && dia >=15){
            idade = 2023 - ano - 1;
        }
        else{
            idade = 2023 - ano;
        }
        String retorno = "" + nome + " - " + idade + " anos";
        return retorno;
    }
    
}
