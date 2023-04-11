package _12Inheritance;

public class _1_OverviewPolimorphism {

	public static void main(String[] args) {
		
		AnimalMejorado a1 = new GatoMejorado(5);
		AnimalMejorado a2 = new PerroMejorado(25);
		GatoMejorado a3 = new GatoMejorado(10);
		PerroMejorado a4 = new PerroMejorado(30);
		AnimalMejorado a5 = new OsoMejorado(800);
		OsoMejorado a6 = new OsoMejorado(1000);
		
		a1.identificar();
		System.out.println(" y peso " + a1.getPeso() + "Kg.");
		        
		a2.identificar();
		System.out.println(" y peso " + a2.getPeso() + "Kg.");
		        
		a3.identificar();
		System.out.println(" y peso " + a3.getPeso() + "Kg.");   
		        
		a4.identificar();
		System.out.println(" y peso " + a4.getPeso() + "Kg.");
		
		a5.identificar();
		System.out.println(" y peso " + a5.getPeso() + "Kg.");
		        
		a6.identificar();
		System.out.println(" y peso " + a6.getPeso() + "Kg.");
		a6.rugir((byte)4);
		
	}
}
