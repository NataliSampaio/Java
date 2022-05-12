package br.edu.up.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Animal;
import br.edu.up.model.Cachorro;
import br.edu.up.model.Homem;
import br.edu.up.model.Ser;

public class Programa {
	
	
//criando listas 
	//Forma simplificada List listadeAlgumaCoisa=new ArrayList();

	List<Object> listadeObjetos=new ArrayList();
	List<Ser>listadeSeres=new ArrayList();
	static List<Animal>listadeAnimais=new ArrayList();
	static List<Cachorro>listadeCachorros=new ArrayList();
	

	
	public static void main(String[] args) {
		
		Animal objetoAnimal=new Animal();
		//objeto mais concreto
		objetoAnimal.nome="Tehx";
		objetoAnimal.genero="Macho";
		objetoAnimal.porte="Pequeno";
		
		try {
			objetoAnimal.setIdade(1);
		} catch (Exception e) {
				System.out.println("Erro: "+e.toString());
		}
		listadeAnimais.add(objetoAnimal);
		
		Cachorro objetoCachorro=new Cachorro();
		objetoCachorro.nome="Amora";
		objetoCachorro.genero="F�mea";
		objetoCachorro.porte="Pequeno";
		
		try {
			objetoAnimal.setIdade(1);
		} catch (Exception e) {
				System.out.println("Erro: "+e.toString());
		}
		listadeCachorros.add(objetoCachorro);
		listadeAnimais.add(objetoCachorro);
		
		Cachorro objetoCachorro1=new Cachorro();
		objetoCachorro1.nome="Jonny";
		objetoCachorro1.genero="Macho";
		objetoCachorro1.porte="Pequeno";
		
		try {
			objetoAnimal.setIdade(8);
		} catch (Exception e) {
				System.out.println("Erro: "+e.toString());
		}
		listadeCachorros.add(objetoCachorro);
		listadeAnimais.add(objetoCachorro);
		
		Cachorro objetoCachorro11=new Cachorro();
		objetoCachorro11.nome="Zeus";
		objetoCachorro11.genero="Macho";
		objetoCachorro11.porte="Grande";
		
		try {
			objetoAnimal.setIdade(3);
		} catch (Exception e) {
				System.out.println("Erro: "+e.toString());
		}
		listadeCachorros.add(objetoCachorro);
		listadeAnimais.add(objetoCachorro);
		
		
		Homem objetoHomem=new Homem();
		objetoHomem.nome="Robson";
		objetoHomem.genero="Macho";
		objetoHomem.porte="M�dio";
		listadeAnimais.add(objetoHomem);
		try {
			objetoAnimal.setIdade(25);
		} catch (Exception e) {
				System.out.println("Erro: "+e.toString());
		}
		
		//for avan�ado,percorre toda lista
		for(Animal animal : listadeAnimais) {
			System.out.println("Nome: "+animal.nome);
			System.out.println("G�nero: "+animal.genero);
			System.out.println("Porte: "+animal.porte);
			System.out.println("Idade: "+animal.getIdade());
			System.out.println();
		}
	}
}

		
		
		
		

	


