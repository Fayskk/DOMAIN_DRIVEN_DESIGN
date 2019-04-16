package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNome("Olavo de Carvalho");
		cliente.setCpf("369.785.699-12");
		
		Endereco endereco = new Endereco();
		endereco.setRua("Alagoas");
		endereco.setBairro("Brás");
		endereco.setCep("85561-387");
		endereco.setNumero("33");
		endereco.setComplemento("AP 07");
		cliente.setEndereco(endereco);
		
		ContaCorrente cc = new ContaCorrente();
		cc.setTitular("Olavo de Carvalho");
		cc.setSaldo("7.950,33");		

	}

}
