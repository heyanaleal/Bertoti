/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemadeEnsino;

/**
 *
 * @author User
 */
public class Cadastrar_pessoa {
 

	public static void main(String[] args) {
		
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Pessoa maria = new Pessoa("Maria", "12345", "maria@maria");
		
		fatec.cadastrarPessoa(maria);
		
		System.out.println(fatec.getPessoas());

	}


    
}
