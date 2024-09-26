import java.util.Date;

public class Film extends Medium{

   private String regisseur;

   private int spielzeitInMinuten;

   private boolean UHD;
   private boolean HD;

   private String kommentar;

    public Film(String titel, Genre genre, Urheber urheber, Date erscheinungsdatum, String regisseur, int spielzeitInMinuten, boolean HD, boolean UHD, String kommentar) {
        super(titel, genre, urheber, erscheinungsdatum);
        this.regisseur = regisseur;
        this.spielzeitInMinuten = spielzeitInMinuten;
        this.HD = HD;
        this.UHD = UHD;
        this.kommentar = kommentar;
    }

    @Override
    public String toString() {
        return "Film: {"
                + " Titel= " + this.getTitel()
                + " Genre= " + this.getGenre()
                + " Urheber= " + this.getUrheber()
                + " Spielzeit= " + this.getSpielzeitInMinuten() + " Minuten"
                + " Erscheinungsdatum= " + this.getErscheinungsdatum()
                + " Regisseur= " + this.getRegisseur()
                + " HD= " + this.isHD()
                + " UHD= " + this.isUHD()
                + " Kommentar= " + this.getKommentar() +
                " }";
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public int getSpielzeitInMinuten() {
        return spielzeitInMinuten;
    }

    public void setSpielzeitInMinuten(int spielzeitInMinuten) {
        this.spielzeitInMinuten = spielzeitInMinuten;
    }

    public boolean isUHD() {
        return UHD;
    }

    public void setUHD(boolean UHD) {
        this.UHD = UHD;
    }

    public boolean isHD() {
        return HD;
    }

    public void setHD(boolean HD) {
        this.HD = HD;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
