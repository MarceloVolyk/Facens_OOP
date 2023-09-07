package aula_array_de_objetos_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula_array_de_objetos_2.Aluno;

public class AulaArray2 {

	public static void main(String[] args) {

		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		String selecao = JOptionPane.showInputDialog("Digite: 1) criar aluno | 2) Mostrar alunos | 3) Sair ");
		
		while(!selecao.equals("3")) {
			if(selecao.equals("1")) {
				Aluno aluno = new Aluno();
				aluno.cadastrarAluno();
				listaAlunos.add(aluno);
			}
			else {
				for(Aluno a : listaAlunos) {
					JOptionPane.showMessageDialog(null, a.imprimir());
				}
			}
			selecao = JOptionPane.showInputDialog(null,"Digite: 1) criar aluno | 2) Mostrar alunos | 3) Sair ");
					
		}
	}

}
