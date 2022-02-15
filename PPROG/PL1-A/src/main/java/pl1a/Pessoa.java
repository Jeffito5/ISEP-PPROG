package pl1a;

public class Pessoa {
	
	/**
	 * O nome da pessoa.
	 */
	private String nome;
	
	/**
	 * A idade da pessoa.
	 */
	private int idade;
	
	/**
	 * O nome por omissão.
	 */
	private static final String NOME_POR_OMISSAO="sem nome";
	
	/**
	 * A idade por omissão.
	 */
	private static final int IDADE_POR_OMISSAO=0;
	
	/**
	 * O construtor sem parametro.
	 */
	public Pessoa() {
		nome=NOME_POR_OMISSAO;
		idade=IDADE_POR_OMISSAO;
	}
	
	/**
	 * O construtor com o parametro nome
	 * 
	 * @param nome to nome
	 */
	public Pessoa(String nome) {
		this.nome=nome;
		idade=IDADE_POR_OMISSAO;
	}

	/**
	 * O construtor com parametros nome e idade
	 * 
	 * @param nome to nome
	 * @param idade to idade
	 */
	public Pessoa(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	/**
	 * Retorna o nome
	 * 
	 * @return the nome to nome
	 */
	public String getNome() {

		return nome;
	}

	/**
	 * Define o nome da pessoa
	 * 
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {

		this.nome = nome;
	}
	
	/**
	 * Retorna a idade
	 * 
	 * @return the idade
	 */
	public int getIdade() {

		return idade;
	}

	/**
	 * Define a idade da pessoa
	 * 
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {

		this.idade = idade;
	}
	
	/**
	 * Retorna por extenso o nome e a idade da Pessoa.
	 */
	@Override
	public String toString() {

		return String.format("%s tem %d anos.", nome,idade);
	}
	
}
