public class apostes {
    //dni, gols locals i gols visitants.
    private String dni;
    private int golsLocals;
    private int golsVisitants;
    private String nom;

    public apostes(String dni, int golsLocals, int golsVisitants, String nom) {
        this.dni = dni;
        this.golsLocals = golsLocals;
        this.golsVisitants = golsVisitants;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getGolsLocals() {
        return golsLocals;
    }

    public void setGolsLocals(int golsLocals) {
        if(golsLocals>=0){
        this.golsLocals = golsLocals;
        }else{
            throw new IllegalStateException("No valen valores negativos");
        }
    }

    public int getGolsVisitants() {
        return golsVisitants;
    }

    public void setGolsVisitants(int golsVisitants) {
        this.golsVisitants = golsVisitants;
    }
}
