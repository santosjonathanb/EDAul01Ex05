package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	public double soma (double x, double s) {
		if (x > 1){ //condi��o de parada: cheguei no primeiro termo da somat�ria?
            s = s + (1/x);
            x--;
            return soma(x, s); //chamada da pr�xima fun��o
		} else {
			return s;
		}
	}
}
