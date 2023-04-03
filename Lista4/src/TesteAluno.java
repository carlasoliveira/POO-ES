public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.setNome("Mariana");
        aluno.setIdade(20);
        aluno.setMatricula("12345");
        Double[] notas = {7.5, 8.0, 7.1, 9.3};
        aluno.setNotas(notas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média: " + aluno.calcularMedia(aluno.getNotas()));
    }
}
