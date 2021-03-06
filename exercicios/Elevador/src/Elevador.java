
public class Elevador {
	private int qtdPessoas;
	private int andares;
	private int capacidade;
	private int andarAtual;
	
	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) {
		this.andares = andares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public void inicializa(int capacidade, int andares) {
		this.capacidade = capacidade;
		this.andares = andares;
	}
	
	public void entra() {
		if(qtdPessoas < capacidade) {
			qtdPessoas++;
		} else {
			System.out.println("Elevador cheio!");
		}
		
	}
	public void sai() {
		if(qtdPessoas > 0) {
			qtdPessoas--;
		}else {
			System.out.println("Elevador est� vazio!");
		}
	}
	public void sobe() {
		if(andarAtual > andares) {
			System.out.println("Andar invalido!");
		} else {
			andarAtual++;
		}
	}
	public void desce() {
		if(andarAtual < 0) {
			System.out.println("Andar invalido!");
		} else {
			andarAtual--;
		}
		
	}
}
