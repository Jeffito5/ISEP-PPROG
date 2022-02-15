
import java.util.Objects;

/**
 * @author Luís Araújo
 */
public class Quadro implements Comparable<Quadro> {
    private String designacao;
    private String nome_autor;
    private Data ano_criacao;

    private static final String DESIGNACAO_POR_OMISSAO = "Sem designação";
    private static final String NOME_POR_OMISSAO = "Sem nome";

    public Quadro(String designacao, String nome_autor, Data ano_criacao) {
        this.designacao = designacao;
        this.nome_autor = nome_autor;
        this.ano_criacao = new Data(ano_criacao);
    }

    public Quadro(String designacao, String nome_autor) {
        this.designacao = designacao;
        this.nome_autor = nome_autor;
    }

    public Quadro(String designacao) {
        this.designacao = designacao;
    }

    public Quadro(Quadro quadro) {
        setNome_autor(quadro.nome_autor);
        setDesignacao(quadro.designacao);
        setDataContrato(quadro.ano_criacao);
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public Data getDataContrato() {
        return new Data(ano_criacao);
    }

    public void setDataContrato(Data ano_criacao) {
        this.ano_criacao = new Data(ano_criacao);
    }

    public void setDataContrato(int diaContrato, int mesContrato, int anoContrato) {
        this.ano_criacao = new Data(anoContrato, mesContrato, diaContrato);
    }

    @Override
    public String toString() {
        return String.format("Quadro do autor %s\n" +
                "Designação: %s\n" +
                "Ano de criação: %s\n", nome_autor, designacao, ano_criacao.toAnoMesDiaString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quadro quadro = (Quadro) o;
        return Objects.equals(designacao, quadro.designacao) && Objects.equals(nome_autor, quadro.nome_autor) && Objects.equals(ano_criacao, quadro.ano_criacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designacao, nome_autor, ano_criacao);
    }

    @Override
    public int compareTo(Quadro q) {
        return this.getNome_autor().compareTo(q.getNome_autor());
    }
}
