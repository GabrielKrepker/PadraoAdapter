import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaDanoTest {

    private Personagem personagem;

    @BeforeEach
    public void setUp() {
        personagem = new Personagem();
    }

    @Test
    public void testDanoLetalRetorna100Pontos() {
        personagem.setDano("Letal");
        assertEquals(100, personagem.getPontosDeDano());
    }

    @Test
    public void testDanoCriticoRetorna65Pontos() {
        personagem.setDano("Crítico");
        assertEquals(65, personagem.getPontosDeDano());
    }

    @Test
    public void testDanoNormalRetorna35Pontos() {
        personagem.setDano("Normal");
        assertEquals(35, personagem.getPontosDeDano());
    }

    @Test
    public void testDanoFracoRetorna10Pontos() {
        personagem.setDano("Fraco");
        assertEquals(10, personagem.getPontosDeDano());
    }

    @Test
    public void test80PontosOuMaisClassificaComoLetal() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(80);
        assertEquals("Letal", adapter.recuperarClassificacao());
    }

    @Test
    public void test100PontosClassificaComoLetal() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(100);
        assertEquals("Letal", adapter.recuperarClassificacao());
    }

    @Test
    public void test50PontosClassificaComoCritico() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(50);
        assertEquals("Crítico", adapter.recuperarClassificacao());
    }

    @Test
    public void test79PontosClassificaComoCritico() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(79);
        assertEquals("Crítico", adapter.recuperarClassificacao());
    }

    @Test
    public void test20PontosClassificaComoNormal() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(20);
        assertEquals("Normal", adapter.recuperarClassificacao());
    }

    @Test
    public void test49PontosClassificaComoNormal() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(49);
        assertEquals("Normal", adapter.recuperarClassificacao());
    }

    @Test
    public void test0PontosClassificaComoFraco() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(0);
        assertEquals("Fraco", adapter.recuperarClassificacao());
    }

    @Test
    public void test19PontosClassificaComoFraco() {
        DanoAdapter adapter = new DanoAdapter(new DanoClassificacao());
        adapter.setPontosDeDano(19);
        assertEquals("Fraco", adapter.recuperarClassificacao());
    }

    @Test
    public void testSetDanoLetalERecuperaClassificacaoLetal() {
        personagem.setDano("Letal");
        assertEquals("Letal", personagem.getClassificacao());
    }

    @Test
    public void testSetDanoCriticoERecuperaClassificacaoCritico() {
        personagem.setDano("Crítico");
        assertEquals("Crítico", personagem.getClassificacao());
    }

    @Test
    public void testSetDanoNormalERecuperaClassificacaoNormal() {
        personagem.setDano("Normal");
        assertEquals("Normal", personagem.getClassificacao());
    }

    @Test
    public void testSetDanoFracoERecuperaClassificacaoFraco() {
        personagem.setDano("Fraco");
        assertEquals("Fraco", personagem.getClassificacao());
    }
}