import java.io.*;

public class NovesExcepcions {

    public static boolean rang(int numero) {
        if (numero < 100 && numero >= 1) {
            return true;
        } else {
           throw new ForaIntervalException("Fora de rang");
        }
    }

    public static boolean multiple10(int numero){
        if(numero%10==0){return true ;
        }else{
            throw  new Mult10Exception("No es multiplo");
        }
    }


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                System.out.println("Introdueix un numero");
                String texto = reader.readLine();
                int numero = Integer.parseInt(texto);

                if (rang(numero)) ;

                System.out.println("Introdueix un numero");
                texto = reader.readLine();
                int numero2 = Integer.parseInt(texto);
                if (rang(numero2)) ;
                if(multiple10(numero2));
                int resultado = numero % numero2;
                System.out.println("El resultado es: "+resultado);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ForaIntervalException e) {
                System.out.println(e.getMessage());
            }catch (Mult10Exception e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
