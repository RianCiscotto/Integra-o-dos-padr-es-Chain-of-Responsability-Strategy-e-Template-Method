package integracao;

public class CalculadoraPreco {
    private float valor;

    public CalculadoraPreco(float valor) {
        this.valor = valor;
    }

    public float calcular(EstrategiaPreco estrategia) {
        return estrategia.calcular(valor);
    }
}
