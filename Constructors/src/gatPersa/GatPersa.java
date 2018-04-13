package gatPersa;

public class GatPersa {
    private int vides;   // vides disponibles del gat Persa

    // constructor per defecte
    public GatPersa() { vides = 7; }

    // constructor específic
    public GatPersa(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        } else {
            this.vides = 7;
        }
    }

    public int getVides() { return vides; }

    // canvia el nombre de vides si el nou valor és vàlid
    public void setVides(int vides) {
        if (vides >= 0) {
            this.vides = vides;
        }
    }

    public static void main(String[] args) {
        GatPersa renat = new GatPersa();
        System.out.println("Al Renat li queden " + renat.getVides() + " vides");
        GatPersa megaRenat = new GatPersa(12);
        System.out.println("A Mega Renat li queden " + megaRenat.getVides() + " vides");
    }
}