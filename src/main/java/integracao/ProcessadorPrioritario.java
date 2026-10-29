package integracao;

public class ProcessadorPrioritario extends ProcessadorSolicitacao {
    private EstrategiaPreco estrategia;

    public ProcessadorPrioritario(EstrategiaPreco estrategia) {
        this.estrategia = estrategia;
    }

    protected float calcular(Solicitacao s) {
        return new CalculadoraPreco(s.getValor()).calcular(estrategia);
    }
}
