public class TestInterface {
    public static void main(String[] args) {
        Quadrat quadrat = new Quadrat(7);
        quadrat.area();
        Cercle cercle = new Cercle(9);
        cercle.area();
        Rectangle rectangle = new Rectangle(4,8);
        rectangle.area();

        Quadrat quadrat2 = new Quadrat(4);
        System.out.println(quadrat.esMajor(quadrat2));
        System.out.println(quadrat.esMenor(quadrat2));
        System.out.println(quadrat.esIgual(quadrat2));

        Cercle cercle2 =new Cercle(4);
        System.out.println(quadrat.esMajor(cercle2));
    }
}
