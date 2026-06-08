public class DanoClassificacao implements IDano {
    private String classificacao;

    @Override
    public String getClassificacao() {
        return this.classificacao;
    }

    @Override
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}