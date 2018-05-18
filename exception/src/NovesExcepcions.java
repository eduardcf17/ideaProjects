import java.io.*;

public class NovesExcepcions {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introdueix un umero");
        try{
        String texto = reader.readLine();
        int numero = Integer.parseInt(texto);
        texto = reader.readLine();
        int numero2 = Integer.parseInt(texto);
        int resultado=numero%numero2;

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
