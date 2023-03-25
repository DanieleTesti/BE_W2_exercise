package esercizio;

import java.util.Scanner;

public class archivio {

	Integer ISBN, nPagine, anno;
	String titolo;
	int selected;
	Scanner scan = new Scanner(System.in);

	public archivio(int isbn, int npagine, int anno, String titolo) {
		this.ISBN = isbn;
		this.nPagine = npagine;
		this.anno = anno;
		this.titolo = titolo;

	}

	public void creaElemento() {
		System.out.println("inserisci: 1 per aggiugnere un book - 2 per aggiungere un magazine");
		this.selected = scan.nextInt();
		scan.nextLine();
		System.out.println("inserisci codice");
		this.ISBN = scan.nextInt();
		scan.nextLine();
		System.out.println("inserisci il numero di pagine");
		this.nPagine = scan.nextInt();
		scan.nextLine();
		System.out.println("inserisci l'anno");
		this.anno = scan.nextInt();
		scan.nextLine();
		System.out.println("inserisci il titolo");
		this.titolo = scan.nextLine();

	}

}