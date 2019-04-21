
public class Telefone {
	private String numero;
	private int ramal;
	private int operadora;
	private int ddd;
	
	public Telefone() {
		
	}
	
	public Telefone(String numero, int ramal, int operadora, int ddd) {
		super();
		this.numero = numero;
		this.ramal = ramal;
		this.operadora = operadora;
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	public int getOperadora() {
		return operadora;
	}
	public void setOperadora(int operadora) {
		this.operadora = operadora;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

}
