package aula_array_de_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AulaArray {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(78456, "Valdemir", "ADS");
		Aluno aluno2 = new Aluno(23545, "Marcelo", "Química");
		Aluno aluno3 = new Aluno(65412, "Costelinha", "Mecânica");

		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		for(int i = 0; i<listaAlunos.size(); i++) {
			JOptionPane.showMessageDialog(null, listaAlunos.get(i).imprimir());
		}

		for(Aluno a : listaAlunos) {
			JOptionPane.showMessageDialog(null, a.imprimir());
		}
		
	}

}
