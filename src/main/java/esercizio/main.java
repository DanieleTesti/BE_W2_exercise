package esercizio;

import java.io.IOException;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		books book1 = new books("Lev Nikolaevic Tolstoj", Genere.ADVENTURE, 1, 250, 1950, "Guerra e pace ");
		books book2 = new books("Franz Kafka", Genere.FANTASY, 2, 530, 1950, "Il processo");
		books book3 = new books("Gustave Flaubert", Genere.ART, 3, 350, 1980, "Madame Bovary");
		books book4 = new books("Miguel de Cervantes", Genere.HISTORY, 4, 320, 1989,
				"Don Chisciotte della Mancia");
		books book5 = new books("Italo Calvino", Genere.HORROR, 5, 520, 1687, "Il barone rampante");
		books book6 = new books("Herman Melville  ", Genere.FANTASY, 6, 540, 2001, "Moby Dick");

		magazine magazine1 = new magazine(TipoMagazine.MENSILE, 7, 30, 2010, "magazine1");
		magazine magazine2 = new magazine(TipoMagazine.MENSILE, 8, 46, 2012, "magazine2");
		magazine magazine3 = new magazine(TipoMagazine.SEMESTRALE, 9, 134, 2015, "magazine3");

		catalogo myCatalogo = new catalogo();

		// ESERCIZIO 1
		System.out.println("-------- ESERCIZIO 1 --------");
		System.out.println("AGGIUNTA ELEMENTI");

		myCatalogo.addElement(book1);
		myCatalogo.addElement(book2);
		myCatalogo.addElement(book3);
		myCatalogo.addElement(book4);
		myCatalogo.addElement(book5);
		myCatalogo.addElement(book6);

		myCatalogo.addElement(magazine1);
		myCatalogo.addElement(magazine2);
		myCatalogo.addElement(magazine3);
		// ESERCIZIO 2
		System.out.println("-------- ESERCIZIO 2 --------");
		System.out.println("CANCELLAZIONE ELEMENTI TRAMITE ISBN");
		myCatalogo.deleteForISBN();

		// ESERCIZIO 3
		System.out.println("-------- ESERCIZIO 3 --------");
		System.out.println("RICERCA ELEMENTI TRAMITE ISBN");
		myCatalogo.searchForISBN();
		Thread.sleep(3000);


		// ESERCIZIO 4
		System.out.println("-------- ESERCIZIO 4 --------");
		System.out.println("RICERCA ELEMENTI TRAMITE ANNO");
		myCatalogo.searchForAnno();
		Thread.sleep(4000);


		// ESERCIZIO 5
		System.out.println("-------- ESERCIZIO 5 --------");

		try {
			catalogo.saveToFile(myCatalogo);
			System.out.println("Caricamento completato!");
			Thread.sleep(3000);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ESERCIZIO 6
		System.out.println("-------- ESERCIZIO 6 --------");
		try {
			catalogo.loadFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
