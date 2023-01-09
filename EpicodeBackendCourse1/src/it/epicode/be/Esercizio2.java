package it.epicode.be;

public class Esercizio2 {

	public static void main(String[] args) {
		
		moltiplica(4, 7);
		
		concatena("Ciao sono Flavio e ho ", 19);
		
		String[] a = new String[5];
		a[0] = "primo";
		a[1] = "secondo";
		a[2] = "terze";
		a[3] = "quarto";
		a[4] = "quinto";
		
		System.out.println(inserisciInArray(a, "sesto"));
		
	}
	
	static void moltiplica(int a, int b) {
		int risultatoMult = a*b;
		System.out.println("Il risultato della moltiplicazione è: " + risultatoMult);
		System.out.println("-----------------------------------------");
	}
	
	static void concatena(String c, int d) {
		System.out.println( c + d + " anni!" );
	}
	
	static String inserisciInArray(String[] a, String b) {
		String[] c = new String[6];
		c[0] = a[0];
		c[1] = a[1];
		c[2] = b;
		c[3] = a[2];
		c[4] = a[3];
		c[5] = a[4];
		return java.util.Arrays.toString(c);
	}

}
