package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:sqlite:C:\\bancodedados\\primeiro_bd_sqlite.db";
		try {//tente fazer isso
			
			Connection con = DriverManager.getConnection(url);//conexão criada.
			Statement stmt=con.createStatement();
			
			Scanner leitor=new Scanner(System.in);
			
			System.out.println("Informe o nome da pessoa: ");
			String nomeEntrada=leitor.nextLine();
			
			System.out.println("Informe o cpf da pessoa: ");
			String cpfEntrada=leitor.nextLine();
			
			System.out.println("Informe a data de nascimento da pessoa: ");
			String dataEntrada=leitor.nextLine();
			
			String querySelect="select * from pessoas ";//criei a variavel 
			
			String queryInsert="insert into pessoas(nome,cpf,dtanasc) values('"+nomeEntrada+"','"+cpfEntrada+"','"+dataEntrada+"')";
			Statement stmtInsert=con.createStatement();
			stmtInsert.execute(queryInsert);
			
			/*String queryUpdate="update pessoas set nome='carlos silva' where id='3'";
			Statement stmtUpdate=con.createStatement();
			stmt.execute(queryUpdate);
			
			String queryDelete="delete from pessoas where id=2";
			Statement stmtDelete=con.createStatement();
			stmt.execute(queryDelete);*/
			
			
			
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
		e.printStackTrace();//imprima para mim toda pilha de erro */
		}//se não conseguir a conexão vai dar falha
		//throws-deixar para lá,surround fazer o tratamento do erro
		
		

	}

}
