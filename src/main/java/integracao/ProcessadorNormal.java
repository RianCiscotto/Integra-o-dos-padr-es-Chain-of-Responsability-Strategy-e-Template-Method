package integracao;

public class ProcessadorNormal extends ProcessadorSolicitacao {
    private EstrategiaPreco estrategia;

    public ProcessadorNormal(EstrategiaPreco estrategia) {
        this.estrategia = estrategia;
    }

    protected float calcular(Solicitacao s) {
        return new CalculadoraPreco(s.getValor()).calcular(estrategia);
    }
}
