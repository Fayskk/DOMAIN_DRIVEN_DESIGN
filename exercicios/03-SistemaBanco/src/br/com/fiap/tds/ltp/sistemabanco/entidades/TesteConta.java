package br.com.fiap.tds.ltp.sistemabanco.entidades;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setNome(entrada.next() + entrada.nextLine());
		cliente.setCpf(entrada.next());
		
		Endereco endereco = new Endereco();
		endereco.setBairro(entrada.next());
		endereco.setCep(entrada.next());
		endereco.setComplemento(entrada.next());
		endereco.setNumero(entrada.nextShort());
		endereco.setRua(entrada.next());
		cliente.setEndereco(endereco);
		
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(entrada.nextDouble());
		conta.setTitular(cliente);
		
		System.out.println(conta.retornaSaldo());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getEndereco().getRua());
		System.out.println(conta.getTitular().getEndereco().getNumero());
		System.out.println(conta.getTitular().getEndereco().getComplemento());
		System.out.println(conta.getTitular().getEndereco().getBairro());
		System.out.println(conta.getTitular().getEndereco().getCep());
	}

}
