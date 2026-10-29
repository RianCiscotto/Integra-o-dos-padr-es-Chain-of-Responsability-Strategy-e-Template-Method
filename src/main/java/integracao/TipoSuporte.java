package integracao;

public class TipoSuporte implements TipoSolicitacao {
    private static TipoSuporte instancia = new TipoSuporte();

    private TipoSuporte() {
    }

    public static TipoSuporte getInstancia() {
        return instancia;
    }
}
