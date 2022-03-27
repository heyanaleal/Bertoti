/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package SistemadeEnsino;

public class Pessoa {
		
		private String nome;
		private String senha;
		private String email;
		
		public Pessoa(String nome, String senha, String email) {
			this.nome = nome;
			this.senha = senha;
			this.email = email;
		}

		public String getNome(){
			return nome;
		}
		public String getEmail(){
			return email;
		}
		public String getSenha(){
			return senha;
		}
				
		public void setNome(String novoNome){
			nome = novoNome;
		}
		public void setEmail(String novoEmail){
			email = novoEmail;
		}
		public void setSenha(String novaSenha){
			senha = novaSenha;
		}
		
	}