package aula_metodos;

import javax.swing.JOptionPane;

public class Aluno {

	private String ra;
	private String nome;
	private String curso;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String imprimir() {
		return "O aluno " + this.nome + " com RA " + this.ra + " pertence ao curso " + this.curso;
	}
	
	public void menu() {
		
		Object[] itens = { "Criar aluno", "Mostrar aluno", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opção",JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
		
		while(selectedItem != "Sair") {
			if(selectedItem == "Criar aluno") {
				String inputRa = JOptionPane.showInputDialog("Informe o RA: ");
				this.setRa(inputRa);
				String inputNome = JOptionPane.showInputDialog("Informe o nome: ");
				this.setNome(inputNome);
				String inputCurso = JOptionPane.showInputDialog("Informe o curso: ");
				this.setCurso(inputCurso);
			}
			else {
				JOptionPane.showMessageDialog(null, this.imprimir());
			}
			selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opção",JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
		}
	}
}
