
public class Carrinho {
	Produto produto;
	boolean escolhaenvio;
	Cliente cliente;
	double valortotal;
	int quantidade;
	Cadastro cadastro;
	
	public void cadastrarCliente (Cliente cliente) {
		
	}
	public void finalizarCompra (Carrinho carrinho, Cliente cliente, Produto produto) {
		
	}
	public void limpar(Carrinho carrinho) {
		
	}
	public void escolherModoenvio() {
		
	}
	public void escolherModopagamento() {
		
	}
	public void adicionarProduto () {
		
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	//public boolean isEscolhaenvio() {
	//	return escolhaenvio;
	//}
	//public void setEscolhaenvio(boolean escolhaenvio) {
	//	this.escolhaenvio = escolhaenvio;
	//}
	//public Cliente getCliente() {
	//	return cliente;
	//}
	//public void setCliente(Cliente cliente) {
	//	this.cliente = cliente;
	//}
	//public double getValortotal() {
	//	return valortotal;
	//}
	//public void setValortotal(double valortotal) {
	//	this.valortotal = valortotal;
	//}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}
