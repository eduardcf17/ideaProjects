public class Rectangle implements Figura,Relacions {
    public int h;
    public int c;

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

    public Rectangle(int h, int c) {
        this.h = h;
        this.c = c;
    }

    @Override
    public float area() {
        return h*c;
    }
}
