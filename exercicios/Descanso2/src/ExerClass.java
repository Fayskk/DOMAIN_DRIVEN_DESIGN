import java.util.Scanner;

public class ExerClass {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a sua idade : ");
		int teste = entrada.nextInt();
		System.out.println("Digite a sua idade : ");
		double teste = entrada.nextdouble();
		
		// TODO Auto-generated method stub
		Produto p1 = new Produto();
		p1.setCodigo(666);
		//p1.codigo = 666;
		p1.setDescricao("Produto 01");
		//p1.descricao = "Produto 01";
		p1.setMarca("Produto Marca");
		//p1.marca = "Produto Marca";
		p1.setValor(70.00);
		//p1.valor = 0.0;
		
		//Produto irineu = new Produto();
		//irineu.codigo = 333;
		//irineu.descricao = "Feh";
		//irineu.marca = "Gloria a Deuxx";
		//irineu.valor = -20.0;
		
		//Produto encosto = new Produto();
		//encosto.codigo = 40;
		//encosto.descricao = "Coisa Ruim";
		//encosto.marca = "IEPG";
		//encosto.valor = 98.0;
		
	
		/*System.out.println(p1.marca + p1.descricao);*/
		System.out.println(p1.getBasico());
		System.out.println(p1.getDetalheMarca());
		System.out.println(p1.getDesconto());
		System.out.println(p1.getValores());
		p1.setAtualizar(10,100);
		System.out.println(p1.getValor());
		p1.setBasico(cod, desc);
		
	}

}
