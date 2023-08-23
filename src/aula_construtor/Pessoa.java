package aula_construtor;

public class Pessoa {

	private String cpf;
	private String nome;
	private String carteiraDeMotorista;
	
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Pessoa(String cpf, String nome, String carteiraDeMotorista) {
		this.cpf = cpf;
		this.nome = nome;
		this.carteiraDeMotorista = carteiraDeMotorista;

	}
	
	public String getCarteiraDeMotorista() {
		return carteiraDeMotorista;
	}
	public void setCarteiraDeMotorista(String carteiraDeMotorista) {
		this.carteiraDeMotorista = carteiraDeMotorista;
	}
	
	public String imprimir() {
		return "A pessoa " + nome + " tem CPF " + cpf + " e CNH " + carteiraDeMotorista;
	}

}
