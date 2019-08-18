package br.com.descancojdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.descancojdbc.conexao.Conexao;
import br.com.descansojdbc.beans.Produto;

public class ProdutoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public ProdutoDAO() throws Exception{
		con = Conexao.queroConectar();
	}
	
	public double getUser(int codigo) throws Exception {
		stmt = con.prepareStatement("select * from RW_T_PRODUTO where ID_PRODUTO=?");
		
		stmt.setInt(1, codigo);
		rs = stmt.executeQuery();
		if (rs.next()) {
			return rs.getDouble("VL_PRODUTO") * rs.getInt("QT_PRODUTO");
			
		}else {
			return 0;
		}
	}
	
	public void encerrar()throws Exception {
		con.close();
	}
	
}