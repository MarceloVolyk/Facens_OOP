package lista1;

import javax.swing.JOptionPane;

public class Funcionario {

	private int cracha;
	private String nome;
	private char tipoVinculo;
	private float valorHora;
	private float qtdeHora;
	private float salario;
	private float valorDesconto;
	
	
	public int getCracha() {
		return cracha;
	}
	public void setCracha(int cracha) {
		this.cracha = cracha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTipoVinculo() {
		return tipoVinculo;
	}
	public void setTipoVinculo(char tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public float getQtdeHora() {
		return qtdeHora;
	}
	public void setQtdeHora(float qtdeHora) {
		this.qtdeHora = qtdeHora;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public float calcularValorSalario() {
		if(tipoVinculo == 'H') {
			return valorHora * qtdeHora - valorDesconto;
		}
		else {
			return salario - valorDesconto;
		}
	}
	
	public String imprimir() {
		return "Crachá: "+cracha+";  Nome: "+nome+";  Tipo vinculo: "+tipoVinculo+";  Salário: "
				+calcularValorSalario()+";  Desconto: "+valorDesconto+";  Valor a receber: "+calcularValorSalario();   
	}
	
	public void menu() {

		Object[] itens = { "Criar funcionário", "Mostrar folha de pagamento", "Alterar remuneração", "Sair" };
		Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

		while (selectedItem != "Sair") {
			if (selectedItem == "Criar funcionário") {
				int inputCracha = Integer.parseInt(JOptionPane.showInputDialog("Informe o n° do crachá: "));
				this.setCracha(inputCracha);
				String inputNome = JOptionPane.showInputDialog("Informe o nome: ");
				this.setNome(inputNome);
				String inputTipoVinculo = JOptionPane.showInputDialog("Tipo do vínculo: ");
				this.setTipoVinculo(tipoVinculo = inputTipoVinculo.charAt(0));
				float inputValorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor/hora: "));
				this.setValorHora(inputValorHora);
				float inputQtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Qtde de horas: "));
				this.setQtdeHora(inputQtdeHora);
				float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
				this.setSalario(inputSalario);
				float inputValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Desconto: "));
				this.setValorDesconto(inputValorDesconto);
			} 
			else if(selectedItem == "Alterar remuneração") {
				String inputTipoVinculo = JOptionPane.showInputDialog("Tipo do vínculo: ");
				this.setTipoVinculo(tipoVinculo = inputTipoVinculo.charAt(0));
				float inputValorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor/hora: "));
				this.setValorHora(inputValorHora);
				float inputQtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Qtde de horas: "));
				this.setQtdeHora(inputQtdeHora);
				float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
				this.setSalario(inputSalario);
				float inputValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Desconto: "));
				this.setValorDesconto(inputValorDesconto);
			}
			else {
				JOptionPane.showMessageDialog(null, this.imprimir());
			}
			
			selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção",
					JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		}
	}
	
}
