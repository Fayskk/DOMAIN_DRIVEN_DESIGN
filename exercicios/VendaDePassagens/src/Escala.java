
public class Escala {
	private String local;
	private String nome;
	private String tempo;
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	private boolean transfer;
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isTranfer() {
		return transfer;
	}
	public void setTranfer(boolean tranfer) {
		this.transfer = tranfer;
	}
	
}
