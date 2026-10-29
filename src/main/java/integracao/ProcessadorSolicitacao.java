package integracao;

public abstract class ProcessadorSolicitacao {
    public final float processar(Solicitacao s) {
        validar(s);
        float valor = calcular(s);
        finalizar(s, valor);
        return valor;
    }

    protected void validar(Solicitacao s) {
        if (s.getValor() <= 0) throw new IllegalArgumentException("Valor inválido");
    }

    protected abstract float calcular(Solicitacao s);

    protected void finalizar(Solicitacao s, float valor) {
    }
}
