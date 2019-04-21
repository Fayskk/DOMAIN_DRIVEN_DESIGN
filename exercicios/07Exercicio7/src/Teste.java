
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println(conta.deposito(20));
		System.out.println(conta.deposito(200));
		System.out.println(conta.deposito(2));
		
		conta.titular = "Fora Temer";
		
		System.out.println (conta.saque(30));

	}

}
