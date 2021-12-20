package grad;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private double altura;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void salvar() {
		System.out.println("[SOBRECARGA]: Método Salvar " + this.nome);
	}
	
	public void salvar(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
		System.out.println("[SOBRECARGA]: Método Salvar " + nome);
	}

	public void salvar(double altura, String nome) {
		this.nome = nome;
		System.out.println("[SOBRECARGA]: Método Salvar " + nome);
	}
	
	public void salvar(Pessoa pessoa) {
		System.out.println("[SOBRECARGA]: Método Salvar " + pessoa.nome);
	}

}
