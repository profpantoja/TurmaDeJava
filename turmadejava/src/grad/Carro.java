package grad;

public class Carro extends Veiculo {

	private int crlv;

	public Carro() {

	}

	public Carro(String marca, String modelo, String cor, int anoModelo, int anoFabrica��o, Pessoa proprietario,
			int crlv) {
		super(marca, modelo, cor, anoModelo, anoFabrica��o, proprietario);
		this.crlv = crlv;
	}

	public Carro(String marca, String modelo, String cor, int anoModelo, int anoFabrica��o, Pessoa proprietario) {
		super(marca, modelo, cor, anoModelo, anoFabrica��o, proprietario);
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
