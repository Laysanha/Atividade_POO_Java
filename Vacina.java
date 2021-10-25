package ativiadeClavisonPoo;

import javax.swing.JOptionPane;

public class Vacina {

	String marca;
	String lote;
	String validade;
	String dataAplicacao;
	

	Vacina() {
		cadastra();
	}

	void cadastra() {
		marca = JOptionPane.showInputDialog("Digite a marca da vacina:");
		lote = JOptionPane.showInputDialog("Digite o lote da vacina:");
		validade = JOptionPane.showInputDialog("Digite a validade da vacina:");
		dataAplicacao = JOptionPane.showInputDialog("Digite a data de aplicação");
	}

	@Override
	public String toString() {
		return "Vacina [marca=" + marca + ", lote=" + lote + ", validade=" + validade + ", dataAplicacao="
				+ dataAplicacao + "]";
	}
	
}
