public class Personagem {
    private IDano dano;
    private DanoAdapter adapter;

    public Personagem() {
        dano = new DanoClassificacao();
        adapter = new DanoAdapter(dano);
    }

    public void setDano(String classificacao) {
        dano.setClassificacao(classificacao);
        adapter.aplicarDano();
    }

    public String getClassificacao() {
        return adapter.recuperarClassificacao();
    }

    public int getPontosDeDano() {
        return adapter.getPontosDeDano();
    }
}