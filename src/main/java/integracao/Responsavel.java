package integracao;

import java.util.ArrayList;

public abstract class Responsavel {
    protected ArrayList lista = new ArrayList();
    private Responsavel superior;

    public Responsavel(Responsavel superior) {
        this.superior = superior;
    }

    public abstract String getDescricao();

    public String validar(Solicitacao s) {
        if (lista.contains(s.getTipo())) return getDescricao();
        if (superior != null) return superior.validar(s);
        return "Sem validação";
    }
}
