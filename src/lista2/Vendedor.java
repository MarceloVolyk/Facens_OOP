package lista2;

import javax.swing.JOptionPane;

public class Vendedor {

	private int codigo;
	private String nome;
	private double percentualComissao;
	
	public Vendedor() {
		
	}

	public Vendedor(int codigo, String nome, double percentualComissao) {
		this.codigo = codigo;
		this.nome = nome;
		this.percentualComissao = percentualComissao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	public String imprimir(double valorVenda) {		
			return "C�digo: "+codigo+
					"\n Nome: "+nome+
					"\n Valor da venda: "+valorVenda+
					"\n % Comiss�o: "+percentualComissao+
					"\n Valor a pagar: $"+calcularPagamentoComissao(valorVenda);
	}
	
	public String imprimir(double valorVenda, double valorDesconto) {
			return "C�digo: "+codigo+
					"\n Nome: "+nome+
					"\n Valor da venda: "+valorVenda+
					"\n % Comiss�o: "+percentualComissao+
					"\n Valor do desconto: $"+valorDesconto+
					"\n Valor a pagar: $"+calcularPagamentoComissao(valorVenda, valorDesconto);
		}
		

	public void menu() {

		Object[] itens = { "Cadastrar vendedor", "Calcular venda", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Cadastro",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Cadastrar vendedor") {
				int inputCodigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do vendedor: "));
				this.setCodigo(inputCodigo);
				String inputNome = JOptionPane.showInputDialog("Informe o nome do vendedor: ");
				this.setNome(inputNome);
				double inputPercentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de comiss�o do vendedor: "));
				this.setPercentualComissao(inputPercentualComissao);
				
			} 
			else {
				double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da venda: "));
				
				Object[] opcoes = { "Sim", "N�o" };
				Object selecao = JOptionPane.showInputDialog(null, "Haver� desconto?", "Cadastro",
						JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
				
				if(selecao == "N�o") {
					JOptionPane.showMessageDialog(null, this.imprimir(valorVenda));
				}
				else {
					double valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Valor do desconto: "));
					JOptionPane.showMessageDialog(null, this.imprimir(valorVenda, valorDesconto));
				}

			}
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Op��o",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
	
	public double calcularPagamentoComissao(double valorVenda) {
		return valorVenda * percentualComissao / 100;
	}
	
	public double calcularPagamentoComissao(double valorVenda, double valorDesconto) {
		return calcularPagamentoComissao(valorVenda) - valorDesconto;
	}
	
}
