
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevador elevador = new Elevador();
		elevador.inicializa(3,8);
		System.out.println(elevador.getAndarAtual());
		System.out.println(elevador.getQtdPessoas());
		
		//elevador.inicializa(capacidade, andares);

	}

}