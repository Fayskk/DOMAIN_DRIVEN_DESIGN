package br.com.fiap.bens;

public class Veiculo {
	private String modelo;
	private String motor;
	private int qtdePortas;
	private boolean zerokm;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdePortas() {
		return qtdePortas;
	}
	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}
	public boolean isZerokm() {
		return zerokm;
	}
	public void setZerokm(boolean zerokm) {
		this.zerokm = zerokm;
	}
}
