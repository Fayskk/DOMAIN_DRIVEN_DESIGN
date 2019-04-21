
public class ContaCorrente {
	public String titular;
	private int agencia;
	private String contaCorrente;
	private double saldo;
	
	public double deposito (double valor) {
		saldo += valor;
		return saldo;		
	}
	public double saque (double valor) {
		saldo -= valor;
		return saldo;		
	}
	
}
