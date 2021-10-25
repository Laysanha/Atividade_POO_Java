package orientadoObjectoexemplo3;

import javax.swing.JOptionPane;

public class Jogador {
	String nome;
	int camisa;
	int gols;
	
	Jogador(){
		cadastra();
	}
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome do jogador");
		camisa = Integer.parseInt(JOptionPane.showInputDialog("Número da camisa:"));
		gols = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de gols:"));
	}
	
	@Override
	public String toString() {
		return nome+" ("+camisa+"): "+gols+"\n";
	}

	
}
