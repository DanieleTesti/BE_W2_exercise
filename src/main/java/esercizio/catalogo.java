package esercizio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class catalogo {

	public catalogo() {
		// TODO Auto-generated constructor stub
	}

	List<archivio> myCatalogo = new ArrayList<archivio>();
	Scanner scan = new Scanner(System.in);

//AGGIUNGE UN ELEMENTO ALL'ARRAYLIST
	public void addElement(archivio archivio) {
		this.myCatalogo.add(archivio);

	}

	public String toString() {
		return this.myCatalogo + "\n";
	}

	// ELIMINA UN ELEMENTO CERCATO PER ISBN

	public void deleteForISBN() {
		int myIsbn;
		System.out.println("inserisci l'ISBN dell'elemento da eliminare:\n");
		myIsbn = scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream().filter(x -> !x.ISBN.equals(myIsbn))
				.collect(Collectors.toList());

		myCatalogo = nuovoCatalogo;
		System.out.println(myCatalogo);
		System.out.println("Questi sono i libri / magazine rimanenti!");
	}

	// CERCA UN ELEMENTO PER ISBN
	public void searchForISBN() {
		int myIsbn;
		System.out.println("inserisci l'ISBN dell'elemento da cercare:\n");
		myIsbn = scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream().filter(x -> x.ISBN.equals(myIsbn))
				.collect(Collectors.toList());

		System.out.println(nuovoCatalogo + "\n");
	}

	// CERCA UN ELEMENTO PER ANNO
	public void searchForAnno() {
		int myYear;
		System.out.println("\ninserisci l'anno dell'elemento da cercare:\n");
		myYear = scan.nextInt();
		scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream().filter(x -> x.anno.equals(myYear))
				.collect(Collectors.toList());

		System.out.println(nuovoCatalogo + "\n");
	}

	// CERCA UN ELEMENTO PER AUTORE
	public void searchForAutore() {
		String myAutore;
		System.out.println("\ninserisci l'Autore dell'elemento da cercare:\n");
		myAutore = scan.nextLine();
		List<archivio> nuovoCatalogo = myCatalogo.stream().filter(x -> x instanceof books).map(x -> (books) x)
				.filter(x -> x.autore.equals(myAutore)).collect(Collectors.toList());
		System.out.println(nuovoCatalogo + "\n");
	}

	// CREAZIONE FILE CON I DATI DEL CATALOGO
	public static void saveToFile(catalogo catalogo) throws IOException {
		File file1 = new File("catalogo.txt");
		FileWriter myFile = new FileWriter(file1);
		PrintWriter newFile = new PrintWriter(myFile);
		newFile.print(catalogo);
		newFile.close();
	}

	// CARICAMENTO FILE DAL DISCO
	public static void loadFromFile() throws IOException {
		File file1 = new File("catalogo.txt");
		String readString = FileUtils.readFileToString(file1, "UTF-8");
		System.out.println(readString);
	}

}