package tec;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoaUm = new Pessoa();
		pessoaUm.setNome("Kate");
		pessoaUm.setSobrenome("Silva");
		pessoaUm.setCpf("111.111.111-11");
		pessoaUm.setCnh("111111");
		pessoaUm.setNascimento("2000-01-01");

		Carro carro = new Carro();

		carro.setCor("Azul");
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		carro.setAnoFabricação(2005);
		carro.setAnoModelo(2006);
		carro.ligar();
		carro.ligar();

		Carro outroCarro = new Carro();

		outroCarro.setCor("Vermelha");
		outroCarro.setMarca("Ferrari");
		outroCarro.setModelo("Spider");
		outroCarro.setAnoFabricação(2020);
		outroCarro.setAnoModelo(2021);
		outroCarro.desligar();

		outroCarro.setDono(pessoaUm);
		System.out.println(outroCarro.getDono().getNome());

		outroCarro.salvar();
		carro.salvar();
	}

}
