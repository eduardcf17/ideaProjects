public class proves {
    public static void main(String[] args) {
        Hora hora1 = new Hora(4, 20, 15);
        Hora hora2 = new Hora();
        System.out.println("hora1 es mayor");
        hora2.setMinut(40);
        System.out.println(hora1.esMajor(hora2));
        System.out.println(hora1.esMenor(hora2));
        System.out.println(hora1.esIgual(hora2));
        hora2.setHora(4);
        System.out.println("hora2 es mayor");
        System.out.println(hora1.esMajor(hora2));
        System.out.println(hora1.esMenor(hora2));
        System.out.println(hora1.esIgual(hora2));
        hora1.setHora(1);
        hora1.setMinut(40);
        hora1.setSegon(0);
        hora2.setHora(1);
        hora2.setMinut(40);
        hora2.setSegon(0);
        System.out.println("iguales");
        System.out.println(hora1.esMajor(hora2));
        System.out.println(hora1.esMenor(hora2));
        System.out.println(hora1.esIgual(hora2));

    }
}
