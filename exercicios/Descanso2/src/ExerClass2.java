import java.util.Scanner;

public class ExerClass2 {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o código do produto : ");
		p1.codigo = entrada.nextInt();
		
		System.out.print("Digite o valor do produto : ");
		p1.valor = entrada.nextDouble();
		System.out.print("Digite a descrição do produto : ");
		p1.descricao = entrada.next();
		p1.descricao + =entrada.nextLine();
		System.out.print("Digite a marca do produto : ");
		p1.marca = entrada.next();
		p1.marca + = entrada.nextLine();
		System.out.println("Produto1 : " + p1.descricao + " - " + p1.valor);

	}

}
