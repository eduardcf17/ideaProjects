package robot;

/*
 * robot.java
 *
 */


public class robot {
    public String nom;
    public float diametre;
    public float  segonsMetre;
    public float  capacitat;
    private float kw;
    private float segons;

    public float getDiametre() {
        return diametre;
    }

    public float getSegonsMetre() {
        return segonsMetre;
    }

    public float getCapacitat() {
        return capacitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDiametre(float diametre) {
        if(diametre>0){
            this.diametre = diametre;
        }
    }

    public void setCapacitat(float capacitat) {
        if(capacitat>0){
            this.capacitat = capacitat;
        }
    }

    public void setSegons(float segons) {
        if(segons>0){
         this.segons = segons;
        }
    }

    public String netejar(float metresQuadrats){
        this.kw=this.kw+(float)((metresQuadrats / this.diametre)*0.1);
        this.segons=this.segons+this.segonsMetre*metresQuadrats;
        String missatge;
        missatge=(this.nom+", ha treballat durant "+this.segonsMetre*metresQuadrats+"segons i gastat"+(float)((metresQuadrats / this.diametre)*0.1)+"kw");
        return missatge;
    }
    public String estat(){
        String missatge;
        missatge=(this.nom+", ha treballat durant "+this.segons+"segons i gastats"+this.kw+"kw");
        return missatge;
    }
}

