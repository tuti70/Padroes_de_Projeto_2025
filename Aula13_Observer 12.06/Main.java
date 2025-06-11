
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testarPlataforma();
    }

    public static void testarPlataforma() {
        System.out.println("=== INÍCIO DOS TESTES ===");

        // 1. Inicialização da plataforma
        PlataformaStreaming netflix = new PlataformaStreaming("CineStream+");
        System.out.println("Plataforma criada: " + netflix);

        // 2. Criação de usuários
        List<Usuario> usuarios = criarUsuarios();

        // 3. Registro dos usuários
        registrarUsuarios(netflix, usuarios);

        // 4. Teste de notificações com diferentes estados
        testarNotificacoes(netflix, usuarios);

        System.out.println("=== FIM DOS TESTES ===");
    }

    private static List<Usuario> criarUsuarios() {
        Usuario usuario1 = new Usuario("Arthur Renato ", Arrays.asList("Ação", "Ficção Científica"));
        Usuario usuario2 = new Usuario("Beatriz Marques", Arrays.asList("Comédia", "Terror"));
        Usuario usuario3 = new Usuario("Pedro Sergio", Arrays.asList("Anime", "Ação"));
        Usuario usuario4 = new Usuario("Yan Lemke", Arrays.asList("Romance", "Drama"));
        Usuario usuario5 = new Usuario("Joselio Francisco", Arrays.asList("Ficção Científica", "Terror", "Ação"));

        return Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5);
    }

    private static void registrarUsuarios(PlataformaStreaming plataforma, List<Usuario> usuarios) {
        System.out.println("\n=== REGISTRO DE USUÁRIOS ===");
        for (Usuario usuario : usuarios) {
            plataforma.registerObserver(usuario, usuario.getGenerosPreferidos());
        }
    }

    private static void testarNotificacoes(PlataformaStreaming plataforma, List<Usuario> usuarios) {
        System.out.println("\n=== TESTE DE NOTIFICAÇÕES ===");

        // Desativa notificações para alguns usuários
        usuarios.get(1).desativarNotificacoes(); // Maria
        usuarios.get(3).desativarNotificacoes(); // Ana

        // Adiciona filmes para testar
        System.out.println("\n--- Adicionando filmes (algumas notificações desativadas) ---");
        plataforma.adicionarFilme(new Filme("Matrix Resurrections", "Ficção Científica"));
        plataforma.adicionarFilme(new Filme("As Branquelas", "Comédia"));

        // Reativa notificações
        usuarios.get(1).ativarNotificacoes(); // Maria

        // Adiciona mais filmes
        System.out.println("\n--- Adicionando filmes (notificações reativadas) ---");
        plataforma.adicionarFilme(new Filme("O Chamado", "Terror"));
        plataforma.adicionarFilme(new Filme("Your Name", "Anime"));

        // Remove um usuário
        System.out.println("\n--- Removendo usuário Carlos ---");
        plataforma.removeObserver(usuarios.get(2));

        // Adiciona último filme
        System.out.println("\n--- Adicionando último filme ---");
        plataforma.adicionarFilme(new Filme("John Wick 4", "Ação"));
    }
}