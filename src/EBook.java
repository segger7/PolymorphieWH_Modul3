import java.util.Date;

public class EBook extends Medium{

    private String Autor;

    private String ISBN;

    private int Seitenzahl;

    private String auflage;

    private String kommentar;

    public EBook(String titel, Genre genre, Urheber urheber, Date erscheinungsdatum, String autor, String ISBN, int seitenzahl, String auflage, String kommentar) {
        super(titel, genre, urheber, erscheinungsdatum);
        Autor = autor;
        this.ISBN = ISBN;
        Seitenzahl = seitenzahl;
        this.auflage = auflage;
        this.kommentar = kommentar;
    }

    @Override
    public String toString() {
        return "Film: {"
                + " Titel= " + this.getTitel()
                + " Genre= " + this.getGenre()
                + " Urheber= " + this.getUrheber()
                + " Autor= " + this.getAutor()
                + " Erscheinungsdatum= " + this.getErscheinungsdatum()
                + " ISBN= " + this.getISBN()
                + " Seitenzahl= " + this.getSeitenzahl()
                + " Auflage= " + this.getAuflage()
                + " Kommentar= " + this.getKommentar() +
                " }";
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getSeitenzahl() {
        return Seitenzahl;
    }

    public void setSeitenzahl(int seitenzahl) {
        Seitenzahl = seitenzahl;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAuflage(String auflage) {
        this.auflage = auflage;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
