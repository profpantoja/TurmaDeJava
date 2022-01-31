package grad;

import java.util.ArrayList;

public class Barco extends Veiculo {

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

}
