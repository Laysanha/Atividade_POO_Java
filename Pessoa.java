package orientadoObjectoExercicio;

import javax.swing.JOptionPane;

public class Pessoa {
	
	String nome;
	double peso;
	double altura;
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
	}
	
	double calcularImc(){
		return peso / (altura * altura);
	}

}
