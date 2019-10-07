package hotel;

/**
 * 
 * Representação de um momento de estadia que o animal passa no hotel que guarda
 * a representação do animal, o valor da estadia e a quantidade de dias que o
 * animal passou.
 * 
 * 
 */
public class Estadia {
	/**
	 * Coleção de animais hospedado
	 */
	private Animal animalHospedado;
	/**
	 * Valor da hospedagem
	 */
	private double valor;
	/**
	 * dias de hospedagem
	 */
	private int dias;

	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		animalHospedado = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	@Override
	public String toString() {
		return this.animalHospedado.getNome() + "," + this.animalHospedado.getTipo() + "," + this.dias
				+ " dias com o preço de R$ " + this.valor;
	}

	public String getNome() {
		return this.animalHospedado.getNome();
	}

	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}

	public int getIdade() {
		return this.animalHospedado.getIdade();
	}

	public String getTipo() {
		return this.animalHospedado.getTipo();
	}

}
