package tec;

public class Carro {

	private String cor;
	private String marca;
	private String modelo;
	private int anoFabricação;
	private int anoModelo;
	private Pessoa dono;
	private boolean ligado = false;

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricação() {
		return anoFabricação;
	}

	public void setAnoFabricação(int anoFabricação) {
		this.anoFabricação = anoFabricação;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	private boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void ligar() {
		if (!this.isLigado()) {
			System.out.println("[" + this.modelo + "]: Carro Ligado!");
			this.ligado = true;
		} else
			System.out.println("[" + this.modelo + "]: Carro já está ligado, seu bizonho!!");
	}

	public void desligar() {
		if (this.ligado) {
			System.out.println("[" + this.modelo + "]: Carro Desligado!");
			this.ligado = false;
		} else
			System.out.println("[" + this.modelo + "]: Carro já está desligado, seu bizonho!!");
	}

	public void salvar() {
		//CarroDAO carroDao = new CarroDAO();
		//carroDao.salvar(this);
		new CarroDAO().salvar(this);
	}
	
}
