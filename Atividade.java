package orientadoObjectoExercicio;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Atividade {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> lista = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			Pessoa p = new Pessoa();
			p.cadastra();
			lista.add(p);
		}
		
		String retorno = "";
		
		for(int i=0; i<lista.size(); i++) {
			retorno += lista.get(i).nome + " - "+ lista.get(i).calcularImc()+"\n";
		}
		
		JOptionPane.showMessageDialog(null, retorno);
		
	}
	
}
