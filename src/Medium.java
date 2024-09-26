import java.util.Date;

public abstract class Medium {

    private String titel;

    private Genre genre;

    private Urheber urheber;

    private Date erscheinungsdatum;

    public Medium(String titel, Genre genre, Urheber urheber, Date erscheinungsdatum) {
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

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }
}
