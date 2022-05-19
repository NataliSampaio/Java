package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) {
		
		
		String url = "jdbc:sqlite:C:\\bancodedados\\primeiro_bd_sqlite.db";
		try {//tente fazer isso
			
			Connection con = DriverManager.getConnection(url);//conexão criada.
			Statement stmt=con.createStatement();
			String querySelect="select * from pessoas ";//criei a variavel 
			ResultSet resultado=stmt.executeQuery(querySelect);//vai trazer o resultado
			
			while(resultado.next()) {
				int id=resultado.getInt(1);//recuperando resultados
				String nome=resultado.getString(2);
				String cpf=resultado.getString(3);
				String datanasc=resultado.getString(4);
				
				//imprimindo
				System.out.println("ID: "+id);
				System.out.println("Nome: "+nome);
				System.out.println("CPF: "+cpf);
				System.out.println("Data Nascimento: "+datanasc);
				System.out.println("__________________");
			}
			
		} catch (SQLException e) {//caso de erro 
		System.out.println("------->ERRO:Falha na conexão com o banco de dados");//surround tratando o erro
		System.out.println(e.getMessage());//mostra mais simplificado
		/*e.printStackTrace();//imprima para mim toda pilha de erro */
		}//se não conseguir a conexão vai dar falha
		//throws-deixar para lá,surround fazer o tratamento do erro
		
		

	}

}
