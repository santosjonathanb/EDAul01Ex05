package view;

import javax.swing.JOptionPane;
import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		double s = 1;
        double x;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira um n�mero para realizar a somat�ria:"));

        SomaController sm = new SomaController();
        double res = sm.soma(x, s);
        System.out.println("Resultado da somat�ria: " + res);
	}
}