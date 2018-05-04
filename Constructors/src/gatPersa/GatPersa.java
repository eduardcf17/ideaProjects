package gatPersa;

public class GatPersa {
    private int vides;   // vides disponibles del gat Persa
    private boolean parlar;
    private String estat;
    // constructor per defecte
    public GatPersa() {
        vides = 7;
        parlar=false;
    }

    // constructor específic
    public GatPersa(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        } else {
            this.vides = 7;
        }
    }

    private void estat(){
        if(this.estat == "aixecat"){
            System.out.println("aixecat");
        }
    }
   /* com estàs?
    aixeca’t
            seu
    estira’t
            miola
    calla
            parla
    adéu*/

    public boolean isParlar() {
        return parlar;
    }

    public void setParlar(boolean parlar) {
        this.parlar = parlar;
    }

    public GatPersa(boolean parlar){
        if(parlar!=false) {
            this.parlar=true;
            System.out.println("He nascut");
        }else{
            this.parlar=false;
        }

    }
    public int getVides() { return vides; }



    // canvia el nombre de vides si el nou valor és vàlid
    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        }
    }




}