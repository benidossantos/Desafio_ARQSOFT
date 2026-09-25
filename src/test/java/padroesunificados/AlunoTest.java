package padroesunificados;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveEmitirHistoricoGraduacao() {
        Aluno aluno = new Aluno("Graduacao");
        assertEquals("Histórico de Graduação", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoPosGraduacao() {
        Aluno aluno = new Aluno("PosGraduacao");
        assertEquals("Histórico de Pós Graduação", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirDiplomaGraduacao() {
        Aluno aluno = new Aluno("Graduacao");
        assertEquals("Diploma de Graduação", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaPosGraduacao() {
        Aluno aluno = new Aluno("PosGraduacao");
        assertEquals("Diploma de Pós Graduação", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDocumentosComFabricaInformada() {
        Aluno aluno = new Aluno(FactoryMethod.getInstance().obterFabrica("Graduacao"));
        assertEquals("Diploma de Graduação", aluno.emitirDiploma());
        assertEquals("Histórico de Graduação", aluno.emitirHistorico());
    }
}
