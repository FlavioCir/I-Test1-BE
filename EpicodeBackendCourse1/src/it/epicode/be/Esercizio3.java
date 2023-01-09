package it.epicode.be;
import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		userTypes();
		
	}
	
	static void userTypes() {
		Scanner info = new Scanner(System.in);
		String[] vars = new String[3];
		
		System.out.println("Inserire un valore e premere invio!");
		System.out.println("prima stringa: ");
		vars[0] = info.nextLine();
		System.out.println("seconda stringa: ");
		vars[1] = info.nextLine();
		System.out.println("terza stringa: ");
		vars[2] = info.nextLine();
		
		System.out.println("Stringa in ordine: " + vars[0] + " - " + vars[1] + " - " + vars[2]);
		System.out.println("Stringa in ordine inverso: " + vars[2] + " - " + vars[1] + " - " + vars[0]);
		info.close();
	}

}
