package _12Inheritance;

public class _1_OverviewAfter {
	
	public static void main(String[] args) {
		AnimalMejorado a = new AnimalMejorado(250);
		GatoMejorado g = new GatoMejorado(6);
		PerroMejorado p = new PerroMejorado(40.5);
		a.identificar();
		System.out.print("y peso " + a.getPeso() + "kg\n");
		p.identificar();
		System.out.print("y peso " + p.getPeso() + "kg\n");
		g.identificar();
		System.out.print("y peso " + g.getPeso() + "kg\n");
	}
	
}
