
public class Teste {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println(conta.deposito(20));
		System.out.println(conta.deposito(100));
		System.out.println(conta.deposito(3));
		
		conta.titular = "Arnaldo da Silva Sauro";
		
		System.out.println(conta.saque(5000));
		conta.exibirSaldo();
	}

}
