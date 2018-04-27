package persona;

public class persona {
    private String nom;
    private String cognoms;
    private int anyNaixement ;
    private int anyDefuncio ;
    private int anyAct = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getAnyNaixement() {
        return anyNaixement;
    }

    public void setAnyNaixement(int anyNaixement) {
        this.anyNaixement = anyNaixement;
    }

    public int getAnyDefuncio() {
        return anyDefuncio;
    }

    public void setAnyDefuncio(int anyDefuncio) {
        this.anyDefuncio = anyDefuncio;
    }

    public persona(String nom, String cognoms, int anyNaixement, int anyDefuncio) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.anyNaixement = anyNaixement;
        this.anyDefuncio = anyDefuncio;
    }
}
