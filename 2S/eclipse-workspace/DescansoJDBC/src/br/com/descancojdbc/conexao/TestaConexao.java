package br.com.descancojdbc.conexao;

import java.sql.Connection;

public class TestaConexao {

	public static void main(String[] args) {
		Connection conectar = null;
		try {
			conectar = Conexao.queroConectar();
			System.out.println("Conectou!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			//Importante fechar conex�o
			conectar.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
