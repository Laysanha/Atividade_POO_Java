package ativiadeClavisonPoo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	
	String nome;
	String vacina = "";
	String vacinaMarca = "";
	String dose1;
	String dose2;
	int idade;

	ArrayList<Vacina> vacinas;
	
	Pessoa() {
		vacinas = new ArrayList<>();
	}

	void cadastra() {
		nome = JOptionPane.showInputDialog("Digite o nome do(a) paciente:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade do paciente:"));
	}
	
	void aplicaVacina() {
		vacina = JOptionPane.showInputDialog("Qual vacina deseja tomar "+ nome +":");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", vacina=" + vacina + ", vacinaDose=" + vacinaMarca + ", dose1=" + dose1
				+ ", dose2=" + dose2 + ", idade=" + idade + ", vacinas=" + vacinas + "]";
	}

}