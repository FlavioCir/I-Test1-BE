package it.epicode.be;

public class Esercizio4 {

	public static void main(String[] args) {
		perimetroRettangolo(10.3, 11.6);
		
		pariDispari(4);
		
		areaTriangolo(5.8, 11.7);
	}
	
	static void perimetroRettangolo(double a, double b) {
		double risultato = (a + b)*2;
		System.out.println("Il perimetro del rettangolo è: " + risultato);
		System.out.println("-----------------------------------------");
	}
	
	static void pariDispari(int numero) {
		if(numero % 2 == 0) {
			System.out.println(0 + "il tuo numero è pari");
		} else {
			System.out.println(1 + "il tuo numero è dispari");
		}
		System.out.println("-----------------------------------------");
	}
	
	static void areaTriangolo(double a, double b) {
		double area = (a*b)/2;
		System.out.println("L'area del triangolo è: " + area);
	}

}
