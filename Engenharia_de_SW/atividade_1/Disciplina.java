/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeEnsino;

public class Disciplina {
    	 String nome;
	 String professor;
	 String aluno;
         boolean equipe;

public Disciplina (String nome, String professor, String aluno, boolean equipe) {
	this.nome = nome;
	this.professor = professor;
	this.aluno = aluno;
        this.equipe = equipe;
            
	}
	
	public String getNome() {
		return nome;
	}
        
	public String getProfessor() {
		return professor;
	}
        
        public String getAluno() {
		return aluno;
	}
        public boolean getEquipe() {
		return equipe;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setProfessor(String novoProfessor) {
		this.professor = novoProfessor;
	}
	
	public void setAluno(String novoAluno) {
		this.aluno = novoAluno;
	}
    
}
