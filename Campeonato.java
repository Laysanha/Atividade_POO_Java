package orientadoObjectoexemplo3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Campeonato {

	static ArrayList<Time> times = new ArrayList<>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar Time\n"
				+ "2 - Listar jogadores de um time\n"
				+ "3 - Verificar artilheiro do campeonato\n"
				+ "4 - Verificar o time com maior saldo de gols\n\n"
				+ "5 - Sair";
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				cadastraTime();
			}
			if(op == 2) {
				listarJogadoresTime();
			}
			if(op == 3) {
				artilheiro();
			}
			if(op == 4) {
				timeMaisGols();
			}
			
		}while(op!=5);
	}
	
	static void cadastraTime() {
		Time t = new Time();
		t.cadastra();
		times.add(t);
	}
	
	static void listarJogadoresTime() {
		String timeBusca = JOptionPane.showInputDialog("Qual time?");
		for (Time time : times) {
			if(time.nome.equalsIgnoreCase(timeBusca)) {
				JOptionPane.showMessageDialog(null, time.toString());
			}
		}
	}
	
	static void artilheiro() {
		Jogador oCara = null;
		for (Time time : times) {
			Jogador artilheiroDoTime = time.artilheiroTime();
			if(oCara == null) {
				oCara = artilheiroDoTime;
			}else {
				if(artilheiroDoTime.gols > oCara.gols)
					oCara = artilheiroDoTime;
			}
		}
		JOptionPane.showMessageDialog(null, oCara);
	}
	
	
	static void timeMaisGols() {
		Time oBom = new Time();
		for (Time time : times) {
			if(time.qtGols() > oBom.qtGols()) {
				oBom = time;
			}
		}
		JOptionPane.showMessageDialog(null, oBom.nome);
	}
}