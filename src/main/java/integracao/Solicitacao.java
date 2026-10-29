package integracao;

public class Solicitacao {
    private TipoSolicitacao tipo;
    private float valor;

    public Solicitacao(TipoSolicitacao tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TipoSolicitacao getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }
}
