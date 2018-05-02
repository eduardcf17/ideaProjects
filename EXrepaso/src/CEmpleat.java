public class CEmpleat {
    public String Nom;
    private String PrimerCognom;
    private String SegonCognom;
    private String EstatCivil;
    private int NombreFills;
    private int DataNaixement;
    private double Salari;
    private String Categoria;

    public CEmpleat(String nom, String primerCognom, String segonCognom, String estatCivil, int nombreFills, int dataNaixement, double salari, String categoria) {
        setNom(nom);
        setPrimerCognom(primerCognom);
        setSegonCognom(segonCognom);
        setEstatCivil(estatCivil);
        setNombreFills(nombreFills);
        setDataNaixement(dataNaixement);
        setSalari(2500);
        setCategoria(categoria);
    }
    public CEmpleat() {
        setNom("nom");
        setPrimerCognom("primerCognom");
        setSegonCognom("segonCognom");
        setEstatCivil("estatCivil");
        setNombreFills(0);
        setDataNaixement(4599);
        setSalari(2000);
        setCategoria("categoria");
    }
    public  CEmpleat copia(){
        CEmpleat copiaEmpleat = new CEmpleat(
                this.Nom,this.PrimerCognom,this.SegonCognom,this.EstatCivil,this.NombreFills,this.DataNaixement,this.Salari,this.Categoria);
        return copiaEmpleat;
    }


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrimerCognom() {
        return PrimerCognom;
    }

    public void setPrimerCognom(String primerCognom) {
        PrimerCognom = primerCognom;
    }

    public String getSegonCognom() {
        return SegonCognom;
    }

    public void setSegonCognom(String segonCognom) {
        SegonCognom = segonCognom;
    }

    public String getEstatCivil() {
        return EstatCivil;
    }

    public void setEstatCivil(String estatCivil) {
        EstatCivil = estatCivil;
    }

    public int getNombreFills() {
        return NombreFills;
    }

    public void setNombreFills(int nombreFills) {
        NombreFills = nombreFills;
    }

    public int getDataNaixement() {
        return DataNaixement;
    }

    public void setDataNaixement(int dataNaixement) {
        DataNaixement = dataNaixement;
    }

    public double getSalari() {
        return Salari;
    }

    public void setSalari(int salari) {
        Salari = salari;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public void incrementa(double porcentaje){
        this.Salari=(this.Salari*(porcentaje)/100)+this.Salari;

    }
    public void incrementa(double porcentaje, int nombreFills){
        this.Salari=(this.Salari*(porcentaje+nombreFills)/100)+this.Salari;

    }

}
