import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Porra {
    static ArrayList<apostes> porra=new ArrayList<apostes>();
    private static int resultadLoc;
    private static int resultadVis;

    public static void main(String[] args) {
        //Pintar menu
        int contador = 0;
        int operacio=0;
        while(operacio!=5){
            System.out.println("---Porra ----");
            System.out.println("1) Afegir aposta ");
            System.out.println("2) Veure Resultat ");
            System.out.println("3) guanyador");
            System.out.println("4) Següent");
            System.out.println("5) Sortir");
            java.util.Scanner lector = new java.util.Scanner(System.in);
            if (lector.hasNextInt()){
                operacio=lector.nextInt();
                switch(operacio){
                    case 1:
                        //TODO Afegir argument que correspongui
                        if (afegirAposta(lector)){
                            //TODO Completar missatge se li ha de dir el torn. Si sóc l'últim, m'afegeixo a la cua i llavors hi ha 5 persones. Quin és el meu torn?
                            System.out.println("Aposta realitzada");

                        }
                        else{
                            System.out.println("Ha hagut un problema amb la inserció de la aposta, torna-ho a provar. Disculpa.");
                        }
                        break;
                    case 2:
                        Random generarGol = new Random();
                        int golAleatorio = 1+generarGol.nextInt(3);
                        int golAleatorio2 = 1+generarGol.nextInt(3);
                        resultadVis = golAleatorio;
                        resultadLoc=golAleatorio2;
                        System.out.println("El local ha marcat:"+resultadLoc+"El visitante ha marcado:"+resultadVis);
                        break;
                    case 3:

                        //TODO Pintar tots els clients de la cua. Amb un ArrayList ens cal pintar element a element, en un for? Quin mètode ens ho pinta tot? O no és un mètode?
                        Iterator<apostes> iterator = porra.iterator();
                        while (iterator.hasNext()){
                            contador=contador+1;
                            if(porra.get(contador).getGolsLocals()==resultadLoc){
                                

                            }
                            System.out.println("El teu nom es: "+nom.getNom());
                        }
                        break;
                    case 4:
                        //TODO Si la cua és més gran que zero es diu el nom del següent client i se'l treu de la cua
                        System.out.println(cuaClients.remove(01));
                        break;
                    default:
                        operacio=5;
                        System.out.println("Adeu, bon dia tingui!");
                }
            }
            else{
                System.out.println("Operació incorrecta, adeu bones tardes!");
                operacio=5;
            }
        }

    }

    //Creació d'un nou mètode que afegeix un Client a la cua.
    //TODO Rep el scanner ha de rebre alguna cosa més?
    public static boolean afegirAposta(java.util.Scanner lector){
        try{
            System.out.println("Quin és el seu nom ?");
            lector = new java.util.Scanner(System.in);
            String nom = lector.next();

            System.out.println("Quin és el seu dni?");
            lector = new java.util.Scanner(System.in);
            String dni = lector.next();


            System.out.println("Gols que marcara l'equip local");
            lector = new java.util.Scanner(System.in);
            String GolsLocalsT = lector.next();
            int GolsLocals= Integer.parseInt(GolsLocalsT);
            System.out.println("Gols que marcara l'equip visitant");
            lector = new java.util.Scanner(System.in);
            String GolsVisitantT = lector.next();
            int GolsVisitant= Integer.parseInt(GolsVisitantT);
            //TODO Aquí s'ha de crear el nou client
            apostes client = new apostes(dni,GolsLocals,GolsVisitant,nom);

            //TODO S'ha d'afegir el nou client a la cua
            porra.add(client);
            //Si falla per excepció ja no tornarà true
            return true;
        }
        catch(Exception e){
            return false;
        }
    }





}
}
