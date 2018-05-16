public class Cercle implements Figura, Relacions{
    public int radi;

    @Override
    public boolean esMajor(Object b) {
        Cercle cercle = (Cercle) b;
        float original;
        float convertido;
        original=area();
        convertido=((Cercle) b).area();
        if(original>convertido){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esMenor(Object b) {
        Cercle cercle = (Cercle) b;
        float original;
        float convertido;
        original=area();
        convertido=((Cercle) b).area();
        if(original>=convertido){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean esIgual(Object b) {
        Cercle cercle = (Cercle) b;
        float original;
        float convertido;
        original=area();
        convertido=((Cercle) b).area();
        if(original==convertido){
            return true;
        }else{
            return false;
        }
    }

    public Cercle(int radi){
        this.radi=radi;
    }
    @Override
    public float area() {
        return (this.radi*this.radi)*Figura.PI;
    }
}
