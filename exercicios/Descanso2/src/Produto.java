
public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	private String marca;
	
	public String getBasico() {
		return codigo + " - " + descricao;
	}
	public String getDetalheMarca() {
		return "A marca é : " + marca;	
	}
	public String getDesconto() {
		return "Produto com desconto : R$" + (valor-(valor*10/100));
	}
	public String getValores() {
		return "Produto sem parcelar :"+ valor + "\nProduto parcelado :" + (valor+(valor*10/100));
	}
	public void setAtualizar(double valor, double porc) {
		this.valor = (valor+valor*(porc/100));
	}
	public void setBasico(int cod,String desc) {
		codigo = cod;
		descricao = desc;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
