package integracao;

public class PrecoPrioritario implements EstrategiaPreco {
    public float calcular(float valor) {
        return valor * 1.10f;
    }
}
