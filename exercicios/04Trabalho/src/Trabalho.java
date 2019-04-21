import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de horas trabalhadas");
		int horas = entrada.nextInt();
		System.out.println("Digite o valor/hora em R$");
		double valor = entrada.nextDouble();
		System.out.println("O seu salario é de R$" + valor * horas );
	}

}
