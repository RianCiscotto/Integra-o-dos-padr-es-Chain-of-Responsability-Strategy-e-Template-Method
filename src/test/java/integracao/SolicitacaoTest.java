package integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoTest {
    @Test
    void deveIntegrarOsTresPadroes() {
        Responsavel atendimento = new ResponsavelAtendimento(null);
        Solicitacao s = new Solicitacao(TipoSuporte.getInstancia(), 100);
        assertEquals("Atendimento", atendimento.validar(s));
        ProcessadorSolicitacao p = new ProcessadorPrioritario(new PrecoNormal());
        assertEquals(100, p.processar(s));
    }

    @Test
    void deveAplicarStrategyNoTemplate() {
        Solicitacao s = new Solicitacao(TipoSuporte.getInstancia(), 100);
        ProcessadorSolicitacao p = new ProcessadorNormal(new PrecoPrioritario());
        assertEquals(110, p.processar(s));
    }
}
