package grad;

public class Carro extends Veiculo implements Voar, Turbo {

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
	
	public void ligar() {
		if (!this.isLigado()) {
			System.out.println("[" + this.getModelo() + "]:  Let's Roll!");
			this.setLigado(true);
		} else
			System.out.println("[" + this.getModelo() + "]:  T� ligado, Bizonho!");
	}

	@Override
	public void decolar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pousar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arremeter() {
		// TODO Auto-generated method stub
		
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
	
}
