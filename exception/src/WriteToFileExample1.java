import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteToFileExample1 {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;
        while (true) {
            System.out.println("Entra la ruta de l'arxiu");
            java.util.Scanner lector = new java.util.Scanner(System.in);
            String Filename = lector.nextLine();
            try {
                fr = new FileReader(Filename);
                br = new BufferedReader(fr);
                String linia;
                br = new BufferedReader(new FileReader(Filename));
                while ((linia = br.readLine()) != null) {
                    System.out.println(linia);
                }break;
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != br) {
                        br.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}