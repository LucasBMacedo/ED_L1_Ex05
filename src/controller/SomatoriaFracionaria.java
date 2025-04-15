package controller;

public class SomatoriaFracionaria {

	public SomatoriaFracionaria() {
		super ();
	}
	public double resultado (int n, int i) {
		if (i > n) {
			return 0;
		}
		return (1/(double)i) + resultado (n, i + 1);
	}
}