package lista1;

import javax.swing.JOptionPane;

public class Pessoa {

	private String cpf;
	private String nome;
	private char sexo;
	private int idade;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String imprimir() {
		return "A pessoa " + this.nome + " ,com CPF " + this.cpf + " ,do sexo " + this.sexo + " ,tem " + this.idade + " anos";
	}

	public void menu() {

		Object[] itens = { "Criar pessoa", "Mostrar pessoa", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar pessoa") {
				String inputCpf = JOptionPane.showInputDialog("Informe o CPF: ");
				this.setCpf(inputCpf);
				String inputNome = JOptionPane.showInputDialog("Informe o nome: ");
				this.setNome(inputNome);
				String inputSexo = JOptionPane.showInputDialog("Informe o sexo: ");
				this.setSexo(sexo = inputSexo.charAt(0));
				int inputIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
				this.setIdade(inputIdade);
			} else {
				JOptionPane.showMessageDialog(null, this.imprimir());
			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
