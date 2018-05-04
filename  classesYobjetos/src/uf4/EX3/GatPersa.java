package uf4.EX3;

public class GatPersa {
    private int vides = 7;   // vides disponibles del gat Persa
    private String estats ="assegut";

    public int getVides() {  // mètode que retorna el nombre de vides
        return vides;
    }
    public String getEstat(){
        return estats;
    }

    public boolean estaViu(){
        if(this.vides>0){
            return true;
        }else{
            return false;
        }
    }
    public boolean estaDret(){
    if(this.estats.equalsIgnoreCase("dret")){
        return true;
        }else {return false;}
    }
    public boolean estaAssegut(){
        if(this.estats.equalsIgnoreCase("assegut")){
            return true;
        }else {
            return false;
        }

    }
    public boolean estaEstirat(){
        if(this.estats.equalsIgnoreCase("estirat")){
            return true;
        }else{
            return false;
        }
    }
    public void aixecat(){
        this.estats="dret";
        System.out.println("El gat s'aixecat");
    }
    public void seu(){
        this.estats="assegut";
        System.out.println("El gat s'assegut");
    }
    public void estirat(){
        this.estats="estirat";
        System.out.println("El gat s'estirat");
    }

    public void setVides(int vides) {
        // modifica el nombre de vides del gat si el paràmetre vides conté un valor vàlid
        if (vides >= 0) {
            this.vides = vides;   // de moment passem per alt aquest "this"
        }
    }
    public void setEstats(String estats) {
        // modifica el nombre de vides del gat si el paràmetre vides conté un valor vàlid
        if (estats.equalsIgnoreCase("assegut") || estats.equalsIgnoreCase("dret") || estats.equalsIgnoreCase("estirat")) {
            this.estats = estats;   // de moment passem per alt aquest "this"
        }
    }
}
