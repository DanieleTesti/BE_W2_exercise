package esercizio;


public class magazine extends archivio {
	
	Enum<TipoMagazine> publicazione;

	public magazine(Enum<TipoMagazine> publicazione, int isbn, int npagine, int anno, String titolo) {
        super(isbn, npagine, anno, titolo);
        this.publicazione = publicazione;
    }

    public String toString() {
        return "\n"+"\nMAGAZINE "+"\nTitolo: " + this.titolo + "\nPubblicazione: " + this.publicazione + "\nNumero pagine: " + this.nPagine + "\nAnno: " + this.anno + "\nISBN: " + this.ISBN;
    }
}