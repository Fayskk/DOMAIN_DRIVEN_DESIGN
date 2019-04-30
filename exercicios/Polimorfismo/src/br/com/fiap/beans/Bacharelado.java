package br.com.fiap.beans;

public class Bacharelado extends Formacao {
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public String getTudo() {
		
	}
	
	public void calcularMensalidade(double fator) {
		
	}
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
}
