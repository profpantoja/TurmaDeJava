package grad;

public class Carro extends Veiculo {

	private int crlv;

	public Carro() {

	}

	public Carro(String marca, String modelo, String cor, int anoModelo, int anoFabricação, Pessoa proprietario,
			int crlv) {
		super(marca, modelo, cor, anoModelo, anoFabricação, proprietario);
		this.crlv = crlv;
	}

	public Carro(String marca, String modelo, String cor, int anoModelo, int anoFabricação, Pessoa proprietario) {
		super(marca, modelo, cor, anoModelo, anoFabricação, proprietario);
	}

	public int getCrlv() {
		return crlv;
	}

	public void setCrlv(int crlv) {
		this.crlv = crlv;
	}

	public void salvar() {
		new CarroDAO().salvar(this);
	}

}
