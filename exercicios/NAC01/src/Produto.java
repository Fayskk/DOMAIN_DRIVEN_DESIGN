
public class Produto {
	String titulo;
	String autor;
	boolean disponibilidade;
	String editora;
	int idioma;
	double valor;
	
	public void adicionarCarrinho(Carrinho carrinho) {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	//public String getAutor() {
	//	return autor;
	//}
	//public void setAutor(String autor) {
	//	this.autor = autor;
	//}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	//public void setDisponibilidade(boolean disponibilidade) {
	//	this.disponibilidade = disponibilidade;
	//}
	//public String getEditora() {
	//	return editora;
	//}
	//public void setEditora(String editora) {
	//	this.editora = editora;
	//}
	//public int getIdioma() {
	//	return idioma;
	//}
	//public void setIdioma(int idioma) {
	//	this.idioma = idioma;
	//}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
