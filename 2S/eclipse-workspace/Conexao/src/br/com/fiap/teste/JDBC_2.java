package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class JDBC_2 {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM82320","060691");
			Statement stmt = c.createStatement();
			String pesquisa = JOptionPane.showInputDialog("Digite o nome: ");
			ResultSet rs = stmt.executeQuery("select * from RW_T_USUARIO where NM_USUARIO LIKE '%" + pesquisa + "%'");			
			while(rs.next()) {
				System.out.println("Nome..." + rs.getString("NM_USUARIO"));
				System.out.println("Senha.." + rs.getString("PW_USUARIO"));
				System.out.println("Código." + rs.getString("ID_USUARIO"));
			}
			
			System.out.println("FOI CARALEO!!!");
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
