package br.edu.up.model;

public class Animal {
	
	public String nome;
	public String genero;
	public String porte;
	private int idade; //1 a 150 uma forma de proteger
	
	public int getIdade() {//serve para pegar a idade
		return this.idade;//retorna a idade
	}
	
	public void setIdade(int IdadeDeFora) throws Exception {
		this.idade =IdadeDeFora;
		if(IdadeDeFora>0 && IdadeDeFora<151) {
			this.idade=IdadeDeFora;
		}else {
		throw new Exception("Idade Inv�lida");//Vai lan�ar uma excessao e ja voiu ter que resolver o problema 
		//throw new RuntimeException("Idade Inv�lida");//s� vai ser lan�ada quando o programa estiver rodando.
	}

	}
}
