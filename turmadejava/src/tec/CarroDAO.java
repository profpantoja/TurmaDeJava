package tec;

public class CarroDAO {
 
	public void salvar(Carro carro) {
		System.out.println("[DAO-SOBRECARGA]: Informa��es do Carro " + carro.getModelo() + " salvas com sucesso!");
	}
	
}
