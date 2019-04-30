import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int soma = 0;
		int valor = 0;
		int total = 0;
		for (int num = 1; num <= 50; num++ ) {
			do {
				System.out.println("Digite uma idade valida ");
				valor = scn.nextInt();
			}while (valor < 0);
				soma = (valor + soma) ;
		}
		System.out.println("A média de idade é " + soma/50);
	}

}
