import java.io.*;
public class Vehicle {
    private String matricula;
    private int antiguitat; //Les faig privades perque si es tenen que utilizar fare servir geters i setters que permeten tenir un control

    public Vehicle(){
        this.matricula="PerDefect";
        this.antiguitat=11;
    }
    public Vehicle(String matricula, int antiguitat){
        setMatricula(matricula);
        setAntiguitat(antiguitat);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        char[] contadorChar = matricula.toCharArray();
        int contador=contadorChar.length;
        if(!(contador<6||contador>9)){
            this.matricula = matricula;
        }else {System.out.println("La matricula no compleix els requisits");}
        }

    public int getAntiguitat() {
        return antiguitat;
    }

    public void setAntiguitat(int antiguitat) {
        if(!(antiguitat<1)){
        this.antiguitat = antiguitat;
        }else {
            System.out.println("Valor no valido,no es positivo");
        }
    }
    @Override
    public String toString() {
        return String.format("La teva matricula es: "+getMatricula()+" i la teva antiguitat es:"+getAntiguitat());


    }
    static class utilitari extends Vehicle{
        private float VelocitatMax;
        private int maxAntig=0;
        public Pilot nom;

        public void assignarPilot(Pilot p){
            this.nom=p;
        }
        public  Pilot desassignarPilot(){
            return nom;
        }

        public float getVelocitatMax() {
            return VelocitatMax;
        }

        public void setVelocitatMax(float velocitatMax) {
            if(!(velocitatMax<0)){
            this.VelocitatMax = velocitatMax;
            }else{System.out.println("Velocitat negativa");}
        }

        @Override
        public String toString() {
            return String.format("La teva matricula es: "+getMatricula()+" i la teva antiguitat es:"+getAntiguitat()+" la teva velocitat maxima es:"+getVelocitatMax());
        }

        public void setMatricula(String matricula) {
            char[] contadorChar = matricula.toCharArray();
            int contador = contadorChar.length;
            if ((!(contador < 6 || contador > 9)) && (contadorChar[0] == 'q')) {
                super.matricula = matricula;
            } else {
                System.out.println("La matricula no compleix els requisits");
            }
        }

        public void setAntiguitat(int antiguitat) {//Tenim que modificar el set antiguitat
            if(!(antiguitat<1)){
                super.antiguitat = antiguitat;

                if(antiguitat>this.maxAntig){
                    this.maxAntig=antiguitat;
                }
            }else {
                System.out.println("Valor no valido,no es positivo");
            }
        }

        public int MaximaAntiguitat(){
            return this.maxAntig;        }//hem modificar el set d'antiguitat

    }

    static class Pilot {
        private String nom;

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

    }




}
