
public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escala escala = new Escala();
		escala.setLocal("Alaska");
		escala.setTempo("10h");
		escala.setTranfer(true);
		
		Passagem passagem = new Passagem();
		passagem.setAssento("A137");
		passagem.setCompanhia("LATAM");
		passagem.setDestino("HONOLULU");
		
		Passageiro passageiro = new Passageiro();
		passageiro.setNome("Xablau");
		passageiro.setPassagem(passagem);
		
		System.out.println(passagem.getEscala()[0].getLocal());
		System.out.println(passagem.getEscala()[0].getTempo());
		
	}

}
