import java.time.LocalDate;

public abstract class Medium {

    private String titel;

    private Genre genre;

    private Urheber urheber;

    private LocalDate erscheinungsdatum;

    public Medium(String titel, Genre genre, Urheber urheber, LocalDate erscheinungsdatum) {
        setTitel(titel);
        setGenre(genre);
        setUrheber(urheber);
        setErscheinungsdatum(erscheinungsdatum);
    }

    @Override
    public abstract String toString();

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(LocalDate erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }
}
