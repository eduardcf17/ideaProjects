public class Hora implements Relacions {
    private int hora;
    private int minut;
    private int segon;

    public Hora(int hora, int minut, int segon) {
        this.hora = hora;
        this.minut = minut;
        this.segon = segon;
    }

    public int getHora() {
        return hora;
    }

    public int getMinut() {
        return minut;
    }

    public void setHora(int hora) {
        if(hora>0){
            this.hora = hora;
        }else{System.out.println("No acepta negativos");}
    }

    public void setMinut(int minut) {
        if(minut<60&&minut>0){
            this.minut = minut;
        }
    }

    public void setSegon(int segon) {
        this.segon = segon;
    }

    public int getSegon() {
        return segon;
    }

    public Hora(){
        hora=0;
        minut=0;
        segon=0;
    }
    public int conversioSegons(){
        return ((this.hora*3600)+(this.minut*60)+this.segon );

    }

    @Override
    public boolean esMajor(Object b) {
        Hora horaF = (Hora)b    ;
        int principal;
        int aComparar;
        principal=conversioSegons();
        aComparar=((Hora) b).conversioSegons();
        if(principal>aComparar){
            return true;
        }else {
        return false;
        }
    }

    @Override
    public boolean esMenor(Object b) {
        Hora horaF = (Hora)b    ;
        int principal;
        int aComparar;
        principal=conversioSegons();
        aComparar=((Hora) b).conversioSegons();
        if(principal>=aComparar){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean esIgual(Object b) {
        Hora horaF = (Hora)b    ;
        int principal;
        int aComparar;
        principal=conversioSegons();
        aComparar=((Hora) b).conversioSegons();
        if(principal==aComparar){
            return true;
        }else {
            return false;
        }
    }
}
