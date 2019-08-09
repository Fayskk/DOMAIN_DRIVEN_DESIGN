package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.entrada.Magica;
import br.com.fiap.excecao.Excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int x = Magica.i("Numero: ");
			System.out.println(x);
			
			String a = Magica.t("Algo: ");
			System.out.println(a.length());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.getExcecao(e));
		}
	}
}
