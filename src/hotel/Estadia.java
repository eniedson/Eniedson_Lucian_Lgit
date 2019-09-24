package hotel;

public class Estadia {
	private Animal animalHospedado;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		
	}
	
	

	@Override
	public String toString() {
		return this.animalHospedado.getNome()+","+this.animalHospedado.getTipo()+","+this.dias+" dias com o preço de R$ "+this.valor;
	}



	public Animal getAnimalHospedado() {
		return animalHospedado;
	}

	public void setAnimalHospedado(Animal animalHospedado) {
		this.animalHospedado = animalHospedado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
}
