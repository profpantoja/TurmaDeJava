package tec;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoaUm = new Pessoa("Kate","Silva","111.111.111-11","111111","2000-01-01");
		//Carro carroQualquer;
		//Carro carroQualquer2 = null;
		
		Carro carro = new Carro("Azul","Fiat","Uno",2005,2006, pessoaUm);
		carro.ligar();

		Carro outroCarro = new Carro("Vermelha","Ferrari","Spider",2020,2021, pessoaUm);
		outroCarro.desligar();
		System.out.println(outroCarro.getDono().getNome());

		//outroCarro.salvar();
		carro.salvar();
		carro.salvar(outroCarro);
		carro.salvar("Celta", 2008);
		carro.salvar(2010, "Fiat");
	}

}
