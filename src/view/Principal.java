package view;

import javax.swing.JOptionPane;

import controller.SomatoriaFracionaria;

public class Principal {

	public static void main(String[] args) {
		int i = 1;
		SomatoriaFracionaria sf = new SomatoriaFracionaria();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro positivo"));
		JOptionPane.showMessageDialog(null, "O resultado da somatória é: " + sf.resultado(n, i));
	}
}