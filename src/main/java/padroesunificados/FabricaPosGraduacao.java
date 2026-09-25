package padroescriacao.unificado;

public class FabricaPosGraduacao implements FabricaAbstrata {

    @Override
    public Diploma createDiploma() {
        return new DiplomaPosGraduacao();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoPosGraduacao();
    }
}