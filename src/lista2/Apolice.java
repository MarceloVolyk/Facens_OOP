package lista2;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Apolice {

	private int numero;
	private String nome;
	private int idade;
	private char sexo;
	private double valorCarro;
	
	public Apolice() {
		
	}

	public Apolice(int numero, String nome, int idade, char sexo, double valorCarro) {
		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.valorCarro = valorCarro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}
	
	public String imprimir() {
		return "Número: "+numero+
			   "\n Nome: "+nome+
			   "\n Idade: "+idade+
			   "\n Sexo: "+sexo+
			   "\n Valor do automóvel: $"+valorCarro+
			   "\n Valor da apólice: $"+calcularValor();
	}
	
	public void menu() {

		Object[] itens = { "Criar apólice", "Ver dados da apólice", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar apólice") {
				int inputNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
				this.setNumero(inputNumero);
				String inputNome = JOptionPane.showInputDialog("Informe o nome: ");
				this.setNome(inputNome);
				int inputIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
				this.setIdade(inputIdade);
				String inputSexo = JOptionPane.showInputDialog("Informe o sexo: ");
				this.setSexo(sexo = inputSexo.charAt(0));
				double inputValorCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do automóvel: "));
				this.setValorCarro(inputValorCarro);
				
			} else {
				JOptionPane.showMessageDialog(null, this.imprimir());
			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
	
	public double calcularValor() {
		if(sexo=='M' && idade <= 25) {
			return valorCarro * 10/100;
		}
		else if(sexo=='M' && idade > 25) {
			return valorCarro * 5/100;
		}
		else{
			return valorCarro * 2/100;
		}
	}
}
