package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX03;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX03 m = new TarefaEd3EX03();
		String palavra;
		int tamanho = 0;

		
		palavra = (JOptionPane.showInputDialog("Digite uma palvra"));
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de caracteres da palvra"));
		
		
		palavra = m.Ex03(palavra, "", tamanho);
		System.out.println(palavra);
	}
}