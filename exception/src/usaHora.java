import java.io.*;
public class usaHora {
    public static void main(String[] args) {
        Hora hora= new Hora();
        try {
            hora.setHora(-7);
            hora.setSegon(60);
            hora.setMinut(75);
            hora.toString();
        } catch (ForaIntervalException e) {
            System.out.println(e.getMessage());
        }

    }
}
