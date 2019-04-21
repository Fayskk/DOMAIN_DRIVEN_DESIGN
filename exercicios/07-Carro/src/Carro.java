
public class Carro {
	String modelo, fabricante;
	int anoFabricacao;
	Cor cor;
	boolean airBag, abs, direcaoHidraulica;
	boolean arCondicionado;
	double preco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirOpcionais() {
		System.out.println("Cor: " + cor.nome);
		System.out.println("Metalica? " + cor.corMetalica);		
		System.out.println("AirBag: " + airBag);
		System.out.println("ABS: " + abs);
		System.out.println("Direção Hidráulica: " + direcaoHidraulica);
		System.out.println("Ar Condicionado: " + arCondicionado);
	}
	
	public void exibirTudo() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Ano: " + anoFabricacao);
		System.out.println("Preço: " + preco);
		exibirOpcionais();
	}
	
	public double getIPI() {
		return 0.075 * preco;
	}
	
	public double getICMS() {
		return 0.06 * preco;
	}	
	
	public double getImpostos() {
		return getIPI() + getICMS();
	}
}
