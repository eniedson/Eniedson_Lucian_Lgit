package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias;
	
	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		estadias.add(new Estadia(nome, tipo, idade, dias, valor));
	}
	
	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equals(nome)) {
				estadias.remove(estadia);
			}
		}
	}
	
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	public double getLucroTotal() {
		double lucro = 0;
		for (Estadia estadia : estadias) {
			lucro += estadia.getValor();
		}
		return lucro;
	}
	
	public String toString() {
		String saida = "Estadias:";
		for (Estadia estadia : estadias) {
			saida += "\n" + estadia.getNome() + "(" + estadia.getTipo() + "): " + estadia.getDias() + " dias com o preco de R$ " + estadia.getValor();
		}
		return saida;
	}
}
