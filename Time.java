package orientadoObjectoexemplo3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	String nome;
	ArrayList<Jogador> jogadores;
	
	Time(){
		jogadores = new ArrayList<>();
	}
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome do time:");
		String continua = "";
		do {
			jogadores.add(new Jogador());
			continua = JOptionPane.showInputDialog("Mais jogadores (S/N)?").toUpperCase();
		}while(continua.equals("S"));
	}
	
	@Override
	public String toString() {
		String retorno = "**** Time: "+nome +"\n\n";
		for(Jogador j : jogadores) {
			retorno += j;
		}
		return retorno;
	}
	
	public Jogador artilheiroTime() {
		Jogador artilheiro = null;
		for (Jogador j : jogadores) {
			if(artilheiro == null) {
				artilheiro = j;
			}else {
				if(j.gols > artilheiro.gols) {
					artilheiro = j;
				}
			}
		}
		return artilheiro;
	}
	
	public int qtGols() {
		int total = 0;
		for (Jogador jogador : jogadores) {
			total += jogador.gols;
		}
		return total;
	}
}
