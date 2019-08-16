package br.com.descansojdbc.beans;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private int quantidade;
	
	public Produto() {
	}
	public Produto(double valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
		
}
