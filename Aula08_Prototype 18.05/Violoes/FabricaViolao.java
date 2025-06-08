import java.util.HashMap;
import java.util.Map;

public class FabricaViolao {
    private Map<String, Violao> prototipos = new HashMap<>();

    public FabricaViolao() {
        inicializarPrototipos();
    }

    private void inicializarPrototipos() {
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new Violao7Cordas());
        prototipos.put("12cordas", new Violao12Cordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duplozero", new ViolaoDuploZero());
        prototipos.put("triplozero", new ViolaoTriploZero());
    }

    public Violao criarViolao(String tipo) {
        Violao prototipo = prototipos.get(tipo.toLowerCase());
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}