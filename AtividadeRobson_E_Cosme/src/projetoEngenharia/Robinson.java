package projetoEngenharia;

import javax.swing.JOptionPane;

public class Robinson {

	private static int a = 0;
	private static int b = 0;
	private int resultado = 0;
	
	public void soma(Integer a_in, Integer b_in){
		resultado = a + b;
		System.out.println("O resultado �: " + resultado);
	}	
	public static void main(String[] args) {
		
		Robinson robinson = new Robinson();
		
		String aString = JOptionPane.showInputDialog("Insira o primeiro n�mero: ");
		String bString = JOptionPane.showInputDialog("Insira o primeiro n�mero: ");
		
		a = Integer.parseInt(aString);
		b = Integer.parseInt(bString);
		
		robinson.soma(a, b);
	}
}
