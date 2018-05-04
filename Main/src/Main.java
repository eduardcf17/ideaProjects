import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float nota,b,peorNota, millor;
        String str;
        b=0;
        System.out.print("Quanta gent: ");
        String text= reader.readLine();
        int numeroAlumn = Integer.parseInt(text);

        while(numeroAlumn>50 || numeroAlumn<1){
            System.out.println("ERROR");
            text= reader.readLine();
            numeroAlumn = Integer.parseInt(text);
        }


        float v[];v = new float[numeroAlumn];
        for(int i=0;i<v.length;i++){
            System.out.print("Introdueix "+(i+1)+": ");
            str = reader.readLine();
            nota = Float.parseFloat(str);
            while(nota>10 || nota<0){
                System.out.println("ERROR");
                System.out.print("Introdueix "+(i+1)+": ");
                str = reader.readLine();
                nota = Float.parseFloat(str);
            }
            v[i]=nota;
            System.out.println(v[i]);
        }

        for(int i=0;i<=v.length-1;i++){
            float v1 = v[i];
            b = b + v1;
        }

        peorNota=v[0];
        millor =v[0];

        for(int i=0;i<v.length;i++){
            float v1 = v[i];
            if(v1>peorNota){
                peorNota=v[i];
            }
            if(v1< millor){
                millor =v[i];
            }
        }
        System.out.println();

        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+", ");
        }


        System.out.println();

        imprimir(b, peorNota, millor, v);
    }

    private static void imprimir(float b, float peorNota, float millor, float[] v) {
        System.out.println("Mitja: "+b/v.length);
        System.out.println("Pitjor: "+peorNota);
        System.out.println("Millor: "+ millor);
    }
}