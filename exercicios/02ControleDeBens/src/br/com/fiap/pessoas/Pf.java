package br.com.fiap.pessoas;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;

public class Pf {
	private String nome;
	private int cpf;
	private Veiculo veiculo;
	private Imovel imovel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
}
