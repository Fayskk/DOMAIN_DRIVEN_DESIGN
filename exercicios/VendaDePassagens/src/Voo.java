
public class Voo {
		private String hora, numVoo, origem, destino, companhia;
		private Escala[] escala = new Escala[10];
		
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public String getNumVoo() {
			return numVoo;
		}
		public void setNumVoo(String numVoo) {
			this.numVoo = numVoo;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getCompanhia() {
			return companhia;
		}
		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}
		public Escala[] getEscala() {
			return escala;
		}
		public void setEscala(Escala[] escala) {
			this.escala = escala;
		}
}
