package pl2b;

/**
 * @author Luís Araújo
 */
public class Utente {
    /**
     * nome
     */
    private String nome;
    /**
     * genero
     */
    private String genero;
    /**
     * idade
     */
    private int idade;
    /**
     * altura
     */
    private float altura;
    /**
     * peso
     */
    private float peso;
    /**
     * variáveis para contar o número de utentes
     */
    private static int totalUtentes = 0;
    /**
     * valor mínimo do imc sujeito a alterações
     */
    private static int minimo = 18;
    /**
     * valor máximo do imc sujeito a alterações
     */
    private static int maximo = 25;

    /**
     * todas as variaveis por omissao
     */

    private static final String NOME_POR_OMISSAO = "Sem nome.";
    private static final String GENERO_POR_OMISSAO = "Sem género.";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final float ALTURA_POR_OMISSAO = 0;
    private static final float PESO_POR_OMISSAO = 0;

    /**
     * construtor sem parâmetros
     */
    public Utente() {
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    /**
     * construtor com todos os parâmetros
     *
     * @param nome
     * @param genero
     * @param idade
     * @param altura
     * @param peso
     */
    public Utente(String nome, String genero, int idade, float altura, float peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }

    /**
     * construtor com nome e idade
     *
     * @param nome
     * @param idade
     */
    public Utente(String nome, int idade) {
        this.nome = nome;
        genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    /**
     * retorna o nome
     *
     * @return nome
     */
    public String getNome() {

        return nome;
    }

    /**
     * retorna o genero
     *
     * @return género
     */
    public String getGenero() {

        return genero;
    }

    /**
     * retorna a idade
     *
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * retorna a altura
     *
     * @return altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * retorna o peso
     *
     * @return peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * retorna o minimo do imc
     *
     * @return imc minimo
     */
    public int getMinimo() {
        return minimo;
    }

    /**
     * retorna o maximo do imc
     *
     * @return imc maximo
     */
    public int getMaximo() {
        return maximo;
    }

    /**
     * retorna o total de utentes
     *
     * @return total de utentes
     */
    public int getTotalUtentes() {
        return totalUtentes;
    }

    /**
     * define o nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * define o género
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * define a idade
     *
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * define a altura
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * define o peso
     *
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * define o mínimo do imc
     *
     * @param minimo
     */
    public static void setMinimo(int minimo) {
        Utente.minimo = minimo;
    }

    /**
     * define o máximo do imc
     *
     * @param maximo
     */
    public static void setMaximo(int maximo) {
        Utente.maximo = maximo;
    }

    /**
     * representação textual do utente
     *
     * @return à representação do utente
     */
    public String toString() {
        return String.format("Ficha de utente do ginásio: "
                + "Nome do utente: %s %n"
                + "Género do utente: %s %n"
                + "Idade do utente: %d %n"
                + "Altura do utente: %.2f %n"
                + "Peso do utente: %.2f %n", nome, genero, idade, altura, peso);
    }

    /**
     * diferença de idades entre 2 utentes
     *
     * @param outroUtente
     * @return diferença de idades
     */
    public int diferencaIdades(Utente outroUtente) {

        return this.idade - outroUtente.getIdade();
    }

    /**
     * cálculo do imc
     *
     * @return valor do imc
     */
    public float indice() {
        /* se a altura for diferente de zero faz tudo à frente do "?". Se a altura for zero faz tudo o que
         * está à frente dos ":" */
        return (altura != 0) ? peso / (float) Math.pow(altura, 2) : 0;
    }

    /**
     * verificação do grau de obesidade
     */
    public String grauDeObesidade() {
        float imc = indice();
        if (imc < minimo) {
            return "Magro";
        }
        if (imc >= minimo && imc <= maximo) {
            return "Saudável";
        }
        if (imc > maximo) {
            return "Obeso";
        }
        return "Dados insuficientes.";
    }

    /**
     * verificar se o grau de obesidade de um utente está no "saudável"
     *
     * @return false se estiver acima ou abaixo do saudável e true se for saudável
     */
    public boolean isSaudavel() {
        float imc = indice();
        if (imc >= minimo && imc <= maximo) {
            return true;
        }
        return false;
    }

    /**
     * determinar qual o mais novo
     *
     * @param outroUtente
     * @return o utente mais novo entre os 2
     */
    public Utente determinarMaisNovo(Utente outroUtente) {
        return idade < outroUtente.idade ? this : (idade > outroUtente.idade ? outroUtente : null);
    }

}


