package orientadoObjecto;
import javax.swing.JOptionPane;

public class Aluno {
		
		String nome;
		int altura;
		char sexo;
		
		void cadastra() {
			nome = JOptionPane.showInputDialog("Nome");
			altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
			sexo = JOptionPane.showInputDialog("Sexo(M,F)").toUpperCase().charAt(0);
		}
		
}
