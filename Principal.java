package ativiadeClavisonPoo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	static ArrayList<Pessoa> pessoas = new ArrayList<>();
	static ArrayList<Vacina> vacinas = new ArrayList<>();

	public static void main(String[] args) {

		String menu = "1 - Cadastrar pessoa" 
				    + "\n2 - Cadastrar vacina" 
				    + "\n3 - Aplicar a vacina"
				    + "\n4 - Listar todas as pessoas" 
				    + "\n5 - Listar Pessoas por marca de vacina"
				    + "\n________________________________________"
				    + "\n6 - Detalhe";
		int op = 0;

		while (op != 6) {

			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				cadastraPessoa();
			}
			if (op == 2) {
				cadastrarVacina();
			}
			if (op == 3) {
				aplicaVacina();
			}
			if (op == 4) {
				listaPessoa();
			}
			if (op == 5) {
				listaPorNome();
			}
			if (op == 6) {
				detalheVacina();
			}
		}
	}

	static void cadastraPessoa() {
		Pessoa p = new Pessoa();
		p.cadastra();
		pessoas.add(p);
	}

	static void cadastrarVacina() {
		Vacina v = new Vacina();
		vacinas.add(v);
	}

	static void aplicaVacina() {
		String nomePesquisa = JOptionPane.showInputDialog("Nome da pessoa para aplicação:");
		for (Pessoa p : pessoas) {
			if (p.nome.equals(nomePesquisa)) {
				p.vacinaMarca = JOptionPane.showInputDialog("Qual marca da vacina:");
				for (Vacina v : vacinas) {
					if (p.vacinaMarca.equals(v.marca)) {	
						p.vacina = JOptionPane.showInputDialog("Qual o dose da tomar:");
						if (p.vacina.equals("1")) {
							p.dose1 = p.vacina;
						}
						if (p.vacina.equals("2")) {
							p.dose2 = p.vacina;
						}
					} 
				}
			}
		}		
	}

	static void listaPessoa() {
		System.out.println(pessoas.toString());
	}
	
	static void listaPorNome() {
		String filtraPorVacina = JOptionPane.showInputDialog("Nome da vacina:");
		
		for (Vacina v : vacinas) {
			if(v.marca.equalsIgnoreCase(filtraPorVacina)) {
				JOptionPane.showMessageDialog(null, pessoas.toString());
			}
		}
	}
	
	static void detalheVacina() {
		 int detalhe = Integer.parseInt(JOptionPane.showInputDialog("1-Sem\n2-Uma\n3-Duas"));

		 if (detalhe == 1) {
			 System.out.println(pessoas.toString());
			for (Pessoa p : pessoas) {
				if(p.dose1 == null) {
					System.out.println(pessoas.toString());
				}
			}
		 }
		 if (detalhe == 2) {
			 System.out.println(pessoas.toString());
				for (Pessoa p : pessoas) {
					if(p.dose1 == "1" && p.dose1 == null) {
						System.out.println(pessoas.toString());
					}
				}
			 }
		 if (detalhe == 3) {
			 System.out.println(pessoas.toString());
				for (Pessoa p : pessoas) {
					if(p.dose1 == "1" && p.dose1 == "2") {
						System.out.println(pessoas.toString());
					}
				}
			 }
	}

}