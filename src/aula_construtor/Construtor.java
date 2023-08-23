package aula_construtor;

import javax.swing.JOptionPane;

public class Construtor {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("123456789", "Marcelo"); 
		Pessoa pessoa2 = new Pessoa("123456789", "Marcelo", "698498156"); 

		
		JOptionPane.showMessageDialog(null,pessoa1.imprimir());
		JOptionPane.showMessageDialog(null,pessoa2.imprimir());

	}

}
