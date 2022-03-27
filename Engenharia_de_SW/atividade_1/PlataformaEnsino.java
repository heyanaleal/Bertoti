/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeEnsino;

import java.util.LinkedList;
import java.util.List;

public class PlataformaEnsino {
	
	
	private final List<Pessoa> pessoas = new LinkedList<>();
	

	public void cadastrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return pessoas;
	}
        private final List<Disciplina> disciplinas = new LinkedList<>();
	

	public void cadastrarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
}