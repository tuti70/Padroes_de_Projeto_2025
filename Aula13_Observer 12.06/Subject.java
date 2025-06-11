
import java.util.List;

public interface Subject {
    void registerObserver(Observer observer, List<String> generos);

    void removeObserver(Observer observer);

    void notifyObservers(Filme filme);
}