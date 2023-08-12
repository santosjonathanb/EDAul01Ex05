package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	public double soma (double x, double s) {
		if (x > 1){ //condição de parada: cheguei no primeiro termo da somatória?
            s = s + (1/x);
            x--;
            return soma(x, s); //chamada da próxima função
		} else {
			return s;
		}
	}
}
