public class Quadrat implements Figura,Relacions {
    public float lado;
    public Quadrat(float lado){
        this.lado=lado;
    }
    @Override
    public float area() {
        return this.lado*this.lado;
    }
    @Override
    public boolean esMajor(Object b) {

        Figura figura = (Figura) b;
        float original;
        float convertido;
        original=area();
        convertido=figura.area();
        if(original>convertido){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esMenor(Object b) {
        Figura figura = (Figura) b;
        float original;
        float convertido;
        original=area();
        convertido=figura.area();
        if(original>=convertido){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean esIgual(Object b) {
        Figura figura = (Figura) b;
        float original;
        float convertido;
        original=area();
        convertido=figura.area();
        if(original==convertido){
            return true;
        }else{
            return false;
        }
    }
}
