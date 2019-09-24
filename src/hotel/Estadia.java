package hotel;

public class Estadia {

	private Animal animalHospedado;
	private double valor;
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
