
public class Elevador {
	private int capacidade;
	private int numAndares;
	private int numPessoas;
	private int andarAtual;
	
	public Elevador(int capacidade, int numAndares) {
		if (capacidade > 0) {
			this.capacidade = capacidade;
		} else {
			System.out.println("Capacidade inválida!");
		}
		
		if (numAndares > 0) {
			this.numAndares = numAndares;
		} else {
			System.out.println("NumAndares inválido!");
		}
	}
	
	public void entra() {
		if(numPessoas < capacidade) {
			numPessoas++;			
		} else {
			System.out.println("Elevador cheio!");
		}
	}
	
	public void sai() {
		if(numPessoas > 0) {
			numPessoas--;
		} else {
			System.out.println("Elevador já está vazio!");
		}
	}
	
	public void sobe() {
		if(andarAtual < numAndares) {
			andarAtual++;
		} else {
			System.out.println("Já está no último andar!");
		}
	}
	
	public void desce() {
		if(andarAtual > 0) {
			andarAtual--;
		} else {
			System.out.println("Já está no térreo!");
		}
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumAndares() {
		return numAndares;
	}

	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
}
