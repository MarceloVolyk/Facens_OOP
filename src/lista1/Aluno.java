package lista1;

import javax.swing.JOptionPane;

public class Aluno {

	private String ra;
	private String nome;
	private float ac1;
	private float ac2;
	private float ag;
	private float af;

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

	public float getAc1() {
		return ac1;
	}

	public void setAc1(float ac1) {
		this.ac1 = ac1;
	}

	public float getAc2() {
		return ac2;
	}

	public void setAc2(float ac2) {
		this.ac2 = ac2;
	}

	public float getAg() {
		return ag;
	}

	public void setAg(float ag) {
		this.ag = ag;
	}

	public float getAf() {
		return af;
	}

	public void setAf(float af) {
		this.af = af;
	}

	public float calcularMedia() {
		return (float) ((ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45));
	}

	public String verificarAprovacao() {
		if (calcularMedia() >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

	public String imprimir() {
		return "RA: " + ra + ";  Nome: " + nome + ";  AC1: " + ac1 + ";  AC2: " + ac2 + ";  AG: " + ag + ";  AF: " + af
				+ ";  Média: " + calcularMedia() + ";  Situação: " + verificarAprovacao();
	}

	public void menu() {

		Object[] itens = { "Criar aluno", "Mostrar aluno", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar aluno") {
				String inputRa = JOptionPane.showInputDialog("Informe o RA: ");
				this.setRa(inputRa);
				String inputNome = JOptionPane.showInputDialog("Informe o nome: ");
				this.setNome(inputNome);
				float inputAc1 = Float.parseFloat(JOptionPane.showInputDialog("AC1: "));
				this.setAc1(inputAc1);
				float inputAc2 = Float.parseFloat(JOptionPane.showInputDialog("AC2: "));
				this.setAc2(inputAc2);
				float inputAg = Float.parseFloat(JOptionPane.showInputDialog("AG: "));
				this.setAg(inputAg);
				float inputAf = Float.parseFloat(JOptionPane.showInputDialog("AF: "));
				this.setAf(inputAf);
			} 
			else {
				JOptionPane.showMessageDialog(null, this.imprimir());
			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
