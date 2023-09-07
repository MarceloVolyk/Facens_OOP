package aula_array_exemplo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula_array_de_objetos_2.Aluno;

public class Funcionario {

	private int codigo;
	private String nome;
	private String setor;
	private String funcao;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(int codigo, String nome, String setor, String funcao, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.setor = setor;
		this.funcao = funcao;
		this.salario = salario;
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String imprimir() {
		return "O funcionário " + this.nome + " de código " + this.codigo + " do setor " + this.setor + " da função "
				+ this.funcao + " tem salário de " + this.salario;
	}

	public void menu() {
		
	ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
	
	String selecao = JOptionPane.showInputDialog("Digite: 1) Cadastrar funcionário | 2) Mostrar todos os funcionários | 3) Mostrar funcionário | 4) Sair ");
	
	while(!selecao.equals("4")) {
		if(selecao.equals("1")) {
			Funcionario funcionario = new Funcionario();

			funcionario.codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: "));
			funcionario.nome = JOptionPane.showInputDialog("Informe o nome: ");
			funcionario.setor = JOptionPane.showInputDialog("Informe o setor: ");
			funcionario.funcao = JOptionPane.showInputDialog("Informe a função: ");
			funcionario.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));

			listaFuncionario.add(funcionario);
		}
		else if(selecao.equals("2")){
			for(Funcionario a : listaFuncionario) {
				JOptionPane.showMessageDialog(null, a.imprimir());
			}
		}
		else {
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário: "));
			for(Funcionario a : listaFuncionario) {
				if(a.codigo == cod) {
					JOptionPane.showMessageDialog(null, a.imprimir());
				}
			}
		}
		selecao = JOptionPane.showInputDialog(null,"Digite: 1) Cadastrar funcionário | 2) Mostrar todos os funcionários | 3) Mostrar funcionário | 4) Sair");
				
	}
  }
}
