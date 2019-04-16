
public class Cliente {
	String nome;
	String cpf;
	String cnpj;
	String email;
	String telefone;
	int meioPagamento;
	String nomeContato;
	String telefoneContato;
	Cadastro cadastro;
	
	public void cadastrarCliente(String nome, String email) {
		
	}
	public void editaDados(String nome) {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	//public String getEmail() {
	//	return email;
	//}
	//public void setEmail(String email) {
	//	this.email = email;
	//}
	//public String getTelefone() {
	//	return telefone;
	//}
	//public void setTelefone(String telefone) {
	//	this.telefone = telefone;
	//}
	//public int getMeioPagamento() {
	//	return meioPagamento;
	//}
	//public void setMeioPagamento(int meioPagamento) {
	//	this.meioPagamento = meioPagamento;
	//}
	//public String getNomeContato() {
	//	return nomeContato;
	//}
	//public void setNomeContato(String nomeContato) {
	//	this.nomeContato = nomeContato;
	//}
	//public String getTelefoneContato() {
	//	return telefoneContato;
	//}
	//public void setTelefoneContato(String telefoneContato) {
	//	this.telefoneContato = telefoneContato;
	//}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
}
