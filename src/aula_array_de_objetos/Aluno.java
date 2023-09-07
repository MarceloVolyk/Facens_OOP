package aula_array_de_objetos;

import javax.swing.JOptionPane;

public class Aluno {

	private int ra;
	private String nome;
	private String curso;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
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
	
	public Aluno() {
		
	}
	
	public Aluno(int ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}
	
	public String imprimir() {
		return "O aluno " + this.nome + " tem RA " + this.ra + " e faz o curso" + this.curso;
	}
	
	
}
