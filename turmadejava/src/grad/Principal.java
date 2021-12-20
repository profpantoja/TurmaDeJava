package grad;

public class Principal {

	public static void main(String[] args) {

		// Carro myFerrari3;
		// Carro myFerrari2 = null;

		Pessoa pessoa = new Pessoa("Alice");
		Carro myFerrari = new Carro("Ferrari", "SF90 Spider", "Vermelha", 2021, 2021, pessoa);
		myFerrari.salvar();

		// pessoa.setNome("Alice");
		// myFerrari.setProprietario(pessoa);

		Pessoa pessoa1 = new Pessoa("Kadu", "Pantoja");
		Carro myCelta = new Carro("Chevrolet", "Celta", "Azul", 2008, 2008, pessoa1);
		myCelta.salvar();

		Pessoa pessoa2 = new Pessoa("Kate");
		// pessoa2.setNome("Kate");
		pessoa2.salvar();
		pessoa2.salvar("Bob", 1.79);
		pessoa2.salvar(pessoa1);
		// System.out.println(pessoa2.getNome());

		System.out.println("[CARRO 1]: " + myFerrari.getModelo() + " - " + myFerrari.getAnoModelo() + " - "
				+ myFerrari.getProprietario());
		System.out.println("[CARRO 2]: " + myCelta.getModelo() + " - " + myCelta.getAnoModelo() + " - "
				+ myCelta.getProprietario());

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
