package grad;

public class Carro {

	private String marca = "Fiat";
	private String modelo = "Uno";
	private String cor = "Branca";
	private int anoModelo = 2020;
	private int anoFabricação = 2019;
	private Pessoa proprietario;
	private boolean ligado = false;

	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, String cor, int anoModelo, int anoFabricação, Pessoa proprietario) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoModelo = anoModelo;
		this.anoFabricação = anoFabricação;
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

	public int getAnoFabricação() {
		return anoFabricação;
	}

	public void setAnoFabricação(int anoFabricação) {
		this.anoFabricação = anoFabricação;
	}

	public String getProprietario() {
		return this.proprietario.getNome();
	}
	
	//public Pessoa getProprietario() {
	//	return proprietario;
	//}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	//public void setLigado(boolean ligado) {
	//	this.ligado = ligado;
	//}

	//public boolean isLigado() {
	//	return this.ligado;
	//}
	
	public void ligar() {
		if (!this.ligado) {
			System.out.println("[" + this.modelo + "]:  Let's Roll!");
			this.ligado = true;
		} else
			System.out.println("[" + this.modelo + "]:  Tô ligado, Bizonho!");
	}

	public void desligar() {
		if (this.ligado) {
			System.out.println("[" + this.modelo + "]:  Let's Stop!");
			this.ligado = false;
		} else
			System.out.println("[" + this.modelo + "]:  Tô desligado, Bizonho!");
	}
	
	public void salvar() {
		new CarroDAO().salvar(this);
	}
	
}
