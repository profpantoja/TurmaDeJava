package grad;

import java.util.ArrayList;

abstract class Veiculo {

	private String marca = "Sem Descri��o";
	private String modelo = "Sem Descri��o";
	private String cor = "Branca";
	private int anoModelo = 2020;
	private int anoFabrica��o = 2019;
	private Pessoa proprietario;
	private ArrayList<Pessoa> passageiros = new ArrayList<Pessoa>();
	private boolean ligado = false;

	public Veiculo() {
	}
	
	public Veiculo(String marca, String modelo, String cor, int anoModelo, int anoFabrica��o, Pessoa proprietario) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoModelo = anoModelo;
		this.anoFabrica��o = anoFabrica��o;
		this.proprietario = proprietario;
	}



	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public int getAnoFabrica��o() {
		return anoFabrica��o;
	}

	public void setAnoFabrica��o(int anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}

	public String getProprietario() {
		if (this.proprietario != null)
			return this.proprietario.getNome();
		else
			return "Sem dono";
	}
	
	// public Pessoa getProprietario() {
	// return proprietario;
	// }

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	// public void setLigado(boolean ligado) {
	// this.ligado = ligado;
	// }

	// public boolean isLigado() {
	// return this.ligado;
	// }

	public ArrayList<Pessoa> getPassageiros() {
		return passageiros;
	}

	// public void setPassageiros(ArrayList<Pessoa> passageiros) {
	// this.passageiros = passageiros;
	// }

	public abstract void ligar();

	public void desligar() {
		if (this.ligado) {
			System.out.println("[" + this.modelo + "]:  Let's Stop!");
			this.ligado = false;
		} else
			System.out.println("[" + this.modelo + "]:  T� desligado, Bizonho!");
	}

	public void adicionarPassageiro(Pessoa pessoa) {
		this.passageiros.add(pessoa);
	}

}
