package br.com.fiap.testes;

import java.util.Scanner;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;
import br.com.fiap.pessoas.PF;

public class ExerClass {

	public static void main(String[] args) {
		PF pessoa = new PF();
		Scanner entrada = new Scanner(System.in);
		pessoa.setNome(entrada.next());
		pessoa.setCpf(entrada.next());
		
		Imovel imovel = new Imovel();
		imovel.setEndereco(entrada.next());
		imovel.setResidencial(entrada.nextBoolean());
		imovel.setTamanho(entrada.nextInt());
		imovel.setValor(entrada.nextDouble());
		pessoa.setImovel(imovel);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setModelo(entrada.next());
		veiculo.setMotor(entrada.next());
		veiculo.setQtdePortas(entrada.nextInt());
		veiculo.setZerokm(entrada.nextBoolean());
		pessoa.setVeiculo(veiculo);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCpf());
		
		System.out.println(pessoa.getImovel().getEndereco());
		System.out.println(pessoa.getImovel().isResidencial());
		System.out.println(pessoa.getImovel().getTamanho());
		System.out.println(pessoa.getImovel().getValor());
		
		System.out.println(pessoa.getVeiculo().getModelo());
		System.out.println(pessoa.getVeiculo().getMotor());
		System.out.println(pessoa.getVeiculo().getQtdePortas());
		System.out.println(pessoa.getVeiculo().isZerokm());
	}
}
