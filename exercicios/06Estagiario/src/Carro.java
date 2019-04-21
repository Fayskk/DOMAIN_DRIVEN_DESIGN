
public class Carro {
	String modelo, fabricante;
	int anoFabricacao;
	Cor cor;
	boolean airbag, abs, direcaoHidraulica, arCondicionado;
	double preco;
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
	public void exibirOpcionais() {};
	
	public void exibirPedido() {
		System.out.println("Modelo " + modelo);
		System.out.println("Fabricante " + fabricante);
		System.out.println("Ano Fabricação " + anoFabricacao);
		System.out.println("Cor " + cor);
	}
	public double getIPI() {
		
	}
}
