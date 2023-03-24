public class Estudante {
    double notaUm = 0;
    double notaDois = 0;
    double media = 0;

    public Estudante(double n1, double n2){
        this.notaUm = n1;
        this.notaDois = n2;
        
        this.media = (n1+n2)/2;
    }
}
