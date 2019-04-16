package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;
import br.com.fiap.pessoas.Pf;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pf p = new Pf();		
		p.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF")));
		p.setNome(JOptionPane.showInputDialog("Digite o Nome"));
		
		Imovel i = new Imovel();
		i.setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
		int opcao = JOptionPane.showConfirmDialog(null, "É residencial?");        
        if (opcao == JOptionPane.YES_OPTION) {
            i.setResidencial(true);
        } else {
            i.setResidencial(false);
        }
		i.setTamanho(JOptionPane.showInputDialog("Digite o tamanho"));
		i.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
		p.setImovel(i);
		
		Veiculo v = new Veiculo();
		v.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
		v.setMotor(JOptionPane.showInputDialog("Digite o motor"));
		v.setQtdePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidaded de portas")));
		int opcaoNovo = JOptionPane.showConfirmDialog(null, "É residencial?");        
        if (opcaoNovo == JOptionPane.YES_OPTION) {
            v.setZero(true);
        } else {
            v.setZero(false);
        }
        p.setVeiculo(v);		
	}

}
