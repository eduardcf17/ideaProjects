public class TestInterface {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(2,4);
        System.out.println("L'area es:"+rectangle1.area());
        Cercle cercle =new Cercle(2);
        System.out.println("L'area es:"+cercle.area());
        Quadrat quadrat=new Quadrat(4);
        System.out.println("L'area es:"+quadrat.area());
    }
}
