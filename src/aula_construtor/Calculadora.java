package aula_construtor;

import javax.swing.JOptionPane;

public class Calculadora {

	public int soma(int num1, int num2) {
		return num1 + num2;
	}

	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public double subtracao(int num1, int num2) {
		return num1 - num2;
	}

	public double subtracao(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicacao(int num1, int num2) {
		return num1 * num2;
	}

	public double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}

	public double divisao(int num1, int num2) {
		return num1 / num2;
	}

	public double divisao(double num1, double num2) {
		return num1 / num2;
	}

	public void menu() {

		Object[] itens = { "Somar", "Subtrair", "Multiplicar", "Dividir", "Sair" };
		String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (!selectedItem.equals("Sair")) {

			// recebe os números como String usando shomInputDialog
			String num1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
			String num2 = JOptionPane.showInputDialog("Informe o segundo número: ");

			switch (selectedItem) {

			case "Somar":
				// verifica se as Strings num1 e num2 contêm pontos (.). Isso indica que são do
				// tipo double
				if (num1.contains(".") || num2.contains(".")) {
					JOptionPane.showMessageDialog(null, this.soma(Double.parseDouble(num1), Double.parseDouble(num2)));
				}
				// se não possuírem pontos, serão do tipo int
				else {
					JOptionPane.showMessageDialog(null, this.soma(Integer.parseInt(num1), Integer.parseInt(num2)));
				}
				break;
			case "Subtrair":
				if (num1.contains(".") || num2.contains(".")) {
					JOptionPane.showMessageDialog(null,
							this.subtracao(Double.parseDouble(num1), Double.parseDouble(num2)));
				} else {
					JOptionPane.showMessageDialog(null, this.subtracao(Integer.parseInt(num1), Integer.parseInt(num2)));
				}
				break;
			case "Multiplicar":
				if (num1.contains(".") || num2.contains(".")) {
					JOptionPane.showMessageDialog(null,
							this.multiplicacao(Double.parseDouble(num1), Double.parseDouble(num2)));
				} else {
					JOptionPane.showMessageDialog(null,
							this.multiplicacao(Integer.parseInt(num1), Integer.parseInt(num2)));
				}
				break;
			case "Dividir":
				if (num1.contains(".") || num2.contains(".")) {
					JOptionPane.showMessageDialog(null,
							this.divisao(Double.parseDouble(num1), Double.parseDouble(num2)));
				} else {
					JOptionPane.showMessageDialog(null, this.divisao(Integer.parseInt(num1), Integer.parseInt(num2)));
				}
				break;
			}
			// checa a opção selecionada na lista suspensa novamente, para ver se "Sair" foi
			// escolhido, se não, repete o looping
			selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
}
