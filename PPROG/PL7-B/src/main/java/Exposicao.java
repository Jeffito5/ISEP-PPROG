import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Luís Araújo
 */
public class Exposicao implements Comparable<Exposicao> {
    private String designacao;
    private Data ano_realizacao;
    private Quadro quadro;
    private final List<Quadro> quadros = new ArrayList<>();

    private static final String DESIGNACAO_POR_OMISSAO = "Sem designação";

    public Exposicao(String designacao, Data ano_realizacao, Quadro quadro) {
        this.designacao = designacao;
        this.ano_realizacao = new Data(ano_realizacao);
        this.quadro = new Quadro(quadro.getDesignacao(), quadro.getNome_autor(), quadro.getDataContrato());
    }

    public Exposicao(int anoContrato, int mesContrato, int diaContrato) {
        this.ano_realizacao = new Data(anoContrato, mesContrato, diaContrato);
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Data getAnoRealizacao() {
        return new Data(ano_realizacao);
    }

    public void setAnoRealizacao(Data ano_realizacao) {
        this.ano_realizacao = new Data(ano_realizacao);
    }

    public void setAnoRealizacao(int diaContrato, int mesContrato, int anoContrato) {
        this.ano_realizacao = new Data(anoContrato, mesContrato, diaContrato);
    }

    public Quadro getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public List<Quadro> getQuadros() {
        return quadros;
    }

    public void setQuadros(List<Quadro> quadros) {
        if (!this.quadros.isEmpty()) {
            for (Quadro quadro : quadros) {
                this.quadros.remove(quadro);
            }
        }
        for (Quadro quadro : quadros) {
            this.quadros.add(new Quadro(quadro));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Exposicao exposicao = (Exposicao) o;
        return Objects.equals(designacao, exposicao.designacao) && Objects.equals(ano_realizacao, exposicao.ano_realizacao) && Objects.equals(quadro, exposicao.quadro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designacao, ano_realizacao, quadro);
    }

    @Override
    public String toString() {
        return String.format("Exposição:\n Designação: %s / Ano realização: %s / Quadros: %s\n", designacao, ano_realizacao, quadro.toString());
    }

    public boolean addQuadro(Quadro quad) {
        return quadros.add(new Quadro(quad));
    }

    /**
     * Adiciona uma lista de quadros à lista.
     *
     * @param quadros .
     */
    public void addQuadros(ArrayList<Quadro> quadros) {
        for (Quadro quadro : quadros) {
            this.quadros.add(new Quadro(quadro));
        }
    }

    /**
     * Remove um quadro e retorna true ou false dependendo do sucesso da operação.
     *
     * @param quad .
     * @return true ou false.
     */
    public boolean removeQuadro(Quadro quad) {
        return quadros.remove(new Quadro(quad));
    }

    /**
     * Remove um conjunto de quadros.
     *
     * @param quadros .
     */
    public void removeQuadros(ArrayList<Quadro> quadros) {
        for (Quadro quadro : quadros) {
            this.quadros.remove(quadro);
        }
    }

    public int compareTo(Exposicao o) {
        return this.ano_realizacao.getAno() - o.ano_realizacao.getAno();
    }
}

