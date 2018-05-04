import java.io.*;
public class Main {
    private static final int _maxAlumn = 50;

    public static void main (String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float nota,sumaNotas,peorNota, millor;
        String str;
        sumaNotas=0;
        System.out.print("Quanta gent: ");
        String text= reader.readLine();
        int numeroAlumn = Integer.parseInt(text);

        while(numeroAlumn>_maxAlumn || numeroAlumn<1){
            System.out.println("ERROR");
            text= reader.readLine();
            numeroAlumn = Integer.parseInt(text);
        }


        float listaNotas[];
        listaNotas = new float[numeroAlumn];
        for(int i=0;i<listaNotas.length;i++){
            System.out.print("Introdueix "+(i+1)+": ");
            str = reader.readLine();
            nota = Float.parseFloat(str);
            while(nota>10 || nota<0){
                System.out.println("ERROR");
                System.out.print("Introdueix "+(i+1)+": ");
                str = reader.readLine();
                nota = Float.parseFloat(str);
            }
            listaNotas[i]=nota;
            System.out.println(listaNotas[i]);
        }

        for(int i=0;i<=listaNotas.length-1;i++){
            float v1 = listaNotas[i];
            sumaNotas = sumaNotas + v1;
        }

        peorNota=listaNotas[0];
        millor =listaNotas[0];

        for(int i=0;i<listaNotas.length;i++){
            float v1 = listaNotas[i];
            if(v1>peorNota){
                peorNota=listaNotas[i];
            }
            if(v1< millor){
                millor =listaNotas[i];
            }
        }
        System.out.println();

        for(int i=0;i<listaNotas.length;i++){
            System.out.print(listaNotas[i]+", ");
        }


        System.out.println();

        imprimir(sumaNotas, peorNota, millor, listaNotas);
    }

    private static void imprimir(float b, float peorNota, float millor, float[] v) {
        System.out.println("Mitja: "+b/v.length);
        System.out.println("Pitjor: "+peorNota);
        System.out.println("Millor: "+ millor);
    }
}

