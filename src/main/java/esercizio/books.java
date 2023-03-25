package esercizio;

public class books extends archivio {

	String autore;
	Enum<Genere> genere;

	public books(String autore, Enum<Genere> genere, int isbn, int npagine, int anno, String titolo) {
		super(isbn, npagine, anno, titolo);
		this.autore = autore;
		this.genere = genere;
	}

	public String toString() {
		return "\n" + "\nBOOK " + "\nTitolo: " + this.titolo + "\nAutore: " + this.autore + "\nGenere: " + this.genere
				+ "\nNumero pagine: " + this.nPagine + "\nAnno: " + this.anno + "\nISBN: " + this.ISBN;

	}

}