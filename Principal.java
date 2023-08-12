package view;

import javax.swing.JOptionPane;
import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		double s = 1;
        double x;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira um número para realizar a somatória:"));

        SomaController sm = new SomaController();
        double res = sm.soma(x, s);
        System.out.println("Resultado da somatória: " + res);
	}
}