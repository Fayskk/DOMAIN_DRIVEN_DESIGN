import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNome(JOptionPane.showInputDialog("Nome"));
		c.setEmail(JOptionPane.showInputDialog("Email"));
		c.setEmail(JOptionPane.showInputDialog("Fone"));
		// inicio do objeto Endere�o
		Endereco e = new Endereco();
		e.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
		e.setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o cep")));
		e.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
		e.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
		e.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
		e.setUf(JOptionPane.showInputDialog("Digite o estado"));
		e.setNumero(JOptionPane.showInputDialog("Digite o n�mero"));
		// final do objeto endere�o
		c.setEndereco(e);
		Telefone t = new Telefone();
		t.setDdd(Integer.parseInt(JOptionPane.showInputDialog("Digite o DDD")));
		t.setRamal(Integer.parseInt(JOptionPane.showInputDialog("Digite o ramal")));
		t.setOperadora(Integer.parseInt(JOptionPane.showInputDialog("Digite a operadora")));
		t.setNumero(JOptionPane.showInputDialog("Digite o numero"));
		c.setTelefone(t);
		
		JOptionPane.showMessageDialog(null, c.getNome(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, c.getEndereco().getBairro(), "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}

}
