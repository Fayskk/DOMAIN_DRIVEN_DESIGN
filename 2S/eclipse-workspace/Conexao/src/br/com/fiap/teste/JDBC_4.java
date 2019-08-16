package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class JDBC_4 {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM82320","060691");
			
			PreparedStatement stmt = c.prepareStatement("select * from RW_T_USUARIO where NM_USUARIO=? and PW_USUARIO=?");
			
			String login = JOptionPane.showInputDialog("Digite o login: ");
			String senha = JOptionPane.showInputDialog("Digite a senha: ");
			
			stmt.setString(1, login);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();			
			if(rs.next()) {
				System.out.println("LOGOU");
			}else {
				System.out.println("N�o tem!!!");
			}
			
			System.out.println("FOI CARALEO!!!");
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
