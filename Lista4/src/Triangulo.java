public class Triangulo {
    double ladoA = 0;
    double ladoB = 0;
    double ladoC = 0;
    String tipoTriangulo = "";

    public Triangulo(double lA, double lB, double lC){
        this.ladoA = lA;
        this.ladoB = lB;
        this.ladoC = lC;
        if(ladoA <= 0 || ladoB <=0 || ladoC <=0){
            this.tipoTriangulo = "Invalido";
        } else {
            if (ladoA == ladoB && ladoB == ladoC){
                this.tipoTriangulo = "Valido-Equilatero";
            } else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
                this.tipoTriangulo = "Valido-Isoceles";            
            } else {
                this.tipoTriangulo = "Valido-Escaleno";
            }
        }
    }
}
