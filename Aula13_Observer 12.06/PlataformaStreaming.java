
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlataformaStreaming implements Subject {
    private String nome;
    private Map<Observer, List<String>> observers;

    public PlataformaStreaming(String nome) {
        this.nome = nome;
        this.observers = new HashMap<>();
    }

    @Override
    public void registerObserver(Observer observer, List<String> generos) {
        observers.put(observer, generos);
        System.out.println(((Usuario) observer).getNome() + " inscrito nos gêneros: " + generos);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(((Usuario) observer).getNome() + " removido da lista de notificações");
    }

    @Override
    public void notifyObservers(Filme filme) {
        for (Map.Entry<Observer, List<String>> entry : observers.entrySet()) {
            Observer observer = entry.getKey();
            List<String> generosInteresse = entry.getValue();

            if (generosInteresse.contains(filme.getGenero())) {
                observer.update(filme);
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        System.out.println("\nNovo filme adicionado à plataforma " + nome + ": " + filme);
        notifyObservers(filme);
    }
}