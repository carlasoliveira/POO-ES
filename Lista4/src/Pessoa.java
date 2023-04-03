public class Pessoa {
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}

/*import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    int diaNascimento = 0;
    int mesNascimento = 0;
    int anoNascimento = 0;
    int idade = 0;

    public Pessoa(int diaNasc, int mesNasc, int anoNasc){
        this.diaNascimento = diaNasc;
        this.mesNascimento = mesNasc;
        this.anoNascimento = anoNasc;

        LocalDate diaAtual = LocalDate.now();
        LocalDate dtNasc = LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento);
        this.idade = Period.between(dtNasc, diaAtual).getYears();
    }
}*/
