package grad;

import java.util.ArrayList;

public class Barco extends Veiculo implements Turbo {

	private int bsade;
	private String fotoEmbarcação;
	private int bade;
	private ArrayList<String> termosResponsabilidade;

	public int getBsade() {
		return bsade;
	}

	public void setBsade(int bsade) {
		this.bsade = bsade;
	}

	public String getFotoEmbarcação() {
		return fotoEmbarcação;
	}

	public void setFotoEmbarcação(String fotoEmbarcação) {
		this.fotoEmbarcação = fotoEmbarcação;
	}

	public int getBade() {
		return bade;
	}

	public void setBade(int bade) {
		this.bade = bade;
	}

	public ArrayList<String> getTermosResponsabilidade() {
		return termosResponsabilidade;
	}

	public void setTermosResponsabilidade(ArrayList<String> termosResponsabilidade) {
		this.termosResponsabilidade = termosResponsabilidade;
	}

	@Override
	public void ligar() {
		if (!this.isLigado()) {
			System.out.println("[" + this.getModelo() + "]:  Let's Swim!");
			this.setLigado(true);
		} else
			System.out.println("[" + this.getModelo() + "]:  Tô ligado, Bizonho!");
	}

	@Override
	public boolean isTurboOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub

	}

	/*
	 * public void ligar() { System.out.println("Lets Swim!!"); }
	 */

}
