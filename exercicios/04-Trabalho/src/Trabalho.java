import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de horas trabalhadas: ");
		int horas = entrada.nextInt();
		
		System.out.println("Digite o valor/hora em R$: ");
		double valor = entrada.nextDouble();
		
		System.out.println("O seu salário é de R$ " + (horas*valor));
	}
}
