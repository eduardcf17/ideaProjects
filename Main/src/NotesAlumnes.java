/*
 * projecto2.java
 *
 */
import java.io.*;

public class NotesAlumnes {

    public static BufferedReader abrirArchivo(String ruta){
        File archivo = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File (ruta);
            br = new BufferedReader(new FileReader (archivo));
        }catch (IOException ex) {
            System.out.println(ex);
        }
        return br;
    }


    public static String leerArchivo(BufferedReader br)throws IOException{
        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
            return linea;
        }
        return "";
    }

    public static void cerrarArchivo(BufferedReader br){
        try{
            if(null!=br  ){
                br.close();
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }



    public static void main (String args[])throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe el nombre del archivo");
        String nombre;
        nombre=reader.readLine();
        BufferedReader br;
        br=null;
        br=abrirArchivo(nombre);

        BufferedWriter bw = null;

        FileWriter fw = new FileWriter(nombre);
        bw = new BufferedWriter(fw);

        bw.write("SET AUTOCOMMIT=1;");
        bw.write("CREATE DATABASE IF NOT EXISTS projecto2 charset latin1;");
        bw.write("USE projecto2;");
        bw.write("CREATE TABLE IF NOT EXISTS project.TABLA (");
        String linea;
        linea=leerArchivo(br);
        String [] valor=linea.split("\t");
        int i;
        int maximo;
        maximo=valor.length;
        for (i=0;i<maximo;i++){
            bw.write(valor[i]+" VARCHAR(20),");
        }
        bw.write("\n");
        bw.close();
        fw.close();
        cerrarArchivo(br);

    }
}



