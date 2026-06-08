public class DanoAdapter extends DanoNumerico {
    private IDano danoClassificacao;

    public DanoAdapter(IDano danoClassificacao) {
        this.danoClassificacao = danoClassificacao;
    }

    public String recuperarClassificacao() {
        int pontos = this.getPontosDeDano();

        if (pontos >= 80)
            danoClassificacao.setClassificacao("Letal");
        else if (pontos >= 50)
            danoClassificacao.setClassificacao("Crítico");
        else if (pontos >= 20)
            danoClassificacao.setClassificacao("Normal");
        else
            danoClassificacao.setClassificacao("Fraco");

        return danoClassificacao.getClassificacao();
    }

    public void aplicarDano() {
        String classificacao = danoClassificacao.getClassificacao();

        switch (classificacao) {
            case "Letal":
                this.setPontosDeDano(100);
                break;
            case "Crítico":
                this.setPontosDeDano(65);
                break;
            case "Normal":
                this.setPontosDeDano(35);
                break;
            default: // "Fraco"
                this.setPontosDeDano(10);
                break;
        }
    }
}