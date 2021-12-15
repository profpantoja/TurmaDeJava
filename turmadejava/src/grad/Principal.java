package grad;

public class Principal {

	public static void main(String[] args) {
			
		Carro myFerrari = new Carro();
		myFerrari.setModelo("SF90 Spider");
		myFerrari.setMarca("Ferrari");
		myFerrari.setCor("vermelha");
		myFerrari.setAnoModelo(2021);
		
		Pessoa pessoa = new Pessoa(); 
		pessoa.setNome("Kate");
		myFerrari.setProprietario(pessoa);
		myFerrari.salvar();
			
		Carro myCelta = new Carro();
		myCelta.setModelo("Celta");
		myCelta.setMarca("Chevrolet");
		myCelta.setCor("azul");
		myCelta.setAnoModelo(2008);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Kadu");
		pessoa1.setSobrenome("Pantoja");
		myCelta.setProprietario(pessoa1);
		
		System.out.println("[CARRO 1]: " + myFerrari.getModelo() + " - " + myFerrari.getAnoModelo() + " - " + myFerrari.getProprietario());
		System.out.println("[CARRO 2]: " + myCelta.getModelo() + " - " + myCelta.getAnoModelo() + " - " + myCelta.getProprietario());
		
		Carro myUno = new Carro();
		System.out.println("[CARRO 3]: " + myUno.getModelo() + " - " + myUno.getAnoModelo());		
		
		myUno.ligar();
		myUno.desligar();
		myCelta.ligar();
		myCelta.ligar();
		myFerrari.ligar();
		myFerrari.desligar();
		myFerrari.desligar();
		
	}

}
