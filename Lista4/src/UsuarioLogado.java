public class UsuarioLogado {
    static int contadorLogados;
    String nomeUsuario;

    public UsuarioLogado(String nome){
        this.nomeUsuario = nome;
        contadorLogados++;
    }
}
