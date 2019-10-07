package hotel;

/**
 * 
 * Representação de um animal que possui nome, tipo e idade
 *
 * 
 * 
 */

public class Animal {

	/**
	 * Nome do animal
	 */
	private String nome;
	/**
	 * Tipo do animal
	 */
	private String tipo;
	/**
	 * Idade do animal
	 */
	private int idade;

	public Animal(String nome, String tipo, int idade) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
