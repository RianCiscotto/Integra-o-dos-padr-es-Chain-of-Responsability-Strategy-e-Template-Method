package integracao;

public class ResponsavelAtendimento extends Responsavel {
    public ResponsavelAtendimento(Responsavel superior) {
        super(superior);
        lista.add(TipoSuporte.getInstancia());
    }

    public String getDescricao() {
        return "Atendimento";
    }
}
