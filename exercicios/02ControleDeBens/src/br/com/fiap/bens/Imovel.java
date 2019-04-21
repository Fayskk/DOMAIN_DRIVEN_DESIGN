package br.com.fiap.bens;

public class Imovel {
	private String tamanho;
	private String endereco;
	private double valor;
	private boolean residencial;
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isResidencial() {
		return residencial;
	}
	public void setResidencial(boolean residencial) {
		this.residencial = residencial;
	}
	
}
