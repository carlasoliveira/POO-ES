package ex3;

public class SomaNumero {
    int somaNumero = 0;
    
    public int somaNumero(int numero){
        for(int cont = 0; cont<=numero; cont++){
            somaNumero = somaNumero + cont;
        }
        return somaNumero;
    }
}
