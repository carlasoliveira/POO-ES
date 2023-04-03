public class App {
    public static void main(String[] args) {
        UsuarioLogado u1 = new UsuarioLogado("José");
        UsuarioLogado u2 = new UsuarioLogado("Francisco");
        UsuarioLogado u3 = new UsuarioLogado("Augusto");
        UsuarioLogado u4 = new UsuarioLogado("Aurora");
        UsuarioLogado u5 = new UsuarioLogado("Alícia");
        System.out.println("Usuário: "+ u1.nomeUsuario+". Contador Usuários: "+u1.contadorLogados);
        System.out.println("Usuário: "+ u2.nomeUsuario+". Contador Usuários: "+u2.contadorLogados);
        System.out.println("Usuário: "+ u3.nomeUsuario+". Contador Usuários: "+u3.contadorLogados);
        System.out.println("Usuário: "+ u4.nomeUsuario+". Contador Usuários: "+u4.contadorLogados);
        System.out.println("Usuário: "+ u5.nomeUsuario+". Contador Usuários: "+u5.contadorLogados);

    }

}
