package tec;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String cnh;
	private String nascimento;

	public Pessoa() {

	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Pessoa(String nome, String sobrenome, String cpf, String cnh, String nascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;	
		this.cnh = cnh;
		this.nascimento = nascimento;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

}
