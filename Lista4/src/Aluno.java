public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private Double[] notas;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public Double[] getNotas() {
        return notas;
    }
    
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(Double[] notas){
        double media = 0;
        for(int i=0; i<notas.length; i++){
            media = media + notas[i];
        }
        return media/notas.length;
    }
    
}
