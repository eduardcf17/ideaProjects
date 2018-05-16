public class Quadrat implements Figura,Relacions {
    public int lado;
    public Quadrat(int lado){
        this.lado=lado;
    }
    @Override
    public float area() {
        return this.lado*this.lado;
    }
    @Override
    public boolean esMajor(Object b) {
        Quadrat quadrat = (Quadrat) b;
        float original;
        float convertido;
        original=area();
        convertido=((Quadrat) b).area();
        if(original>convertido){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esMenor(Object b) {
        Quadrat quadrat = (Quadrat) b;
        float original;
        float convertido;
        original=area();
        convertido=((Quadrat) b).area();
        if(original>=convertido){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean esIgual(Object b) {
        Quadrat quadrat = (Quadrat) b;
        float original;
        float convertido;
        original=area();
        convertido=((Quadrat) b).area();
        if(original==convertido){
            return true;
        }else{
            return false;
        }
    }
}
