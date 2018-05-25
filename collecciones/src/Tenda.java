import java.util.ArrayList;
import java.util.Iterator;

public class Tenda {
	static ArrayList<Client>cuaClients=new ArrayList<Client>();
	public static void main(String[] args) {
		//Heu de definir una variable que serà la cua.
		//Heu de decidir la cua de què serà? Quins elements contindrà la cua?

		//Quin tipus de dades?

		//TODO Definició dades

		//Pintar menu
		int operacio=0;
		while(operacio!=5){
			System.out.println("---VERDURES AARON ----");
			System.out.println("1) Afegir cua ");
			System.out.println("2) Quanta gent hi ha ");
			System.out.println("3) LListar cua");
			System.out.println("4) Següent");
			System.out.println("5) Sortir");
			java.util.Scanner lector = new java.util.Scanner(System.in);
			if (lector.hasNextInt()){
				operacio=lector.nextInt();
				switch(operacio){
					case 1:
						//TODO Afegir argument que correspongui
						if (afegirClient(lector)){
							//TODO Completar missatge se li ha de dir el torn. Si sóc l'últim, m'afegeixo a la cua i llavors hi ha 5 persones. Quin és el meu torn?
							System.out.println("Client afegit, tens el torn "+cuaClients.size());

						}
						else{
							System.out.println("Ha hagut un problema amb la inserció del client, torna-ho a provar. Disculpa.");
						}
						break;
					case 2:
						//TODO Pintar quants elements hi ha a la cua. Quin és l'equivalent al length dels arrays?
						System.out.println(cuaClients.size());
						break;
					case 3:
						//TODO Pintar tots els clients de la cua. Amb un ArrayList ens cal pintar element a element, en un for? Quin mètode ens ho pinta tot? O no és un mètode?
						Iterator<Client> iterator = cuaClients.iterator();
						while (iterator.hasNext()){
							Client nom = iterator.next();
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
	public static boolean afegirClient(java.util.Scanner lector){
		try{
			System.out.println("Quin és el nom del client?");
			lector = new java.util.Scanner(System.in);
			String nom = lector.next();

			System.out.println("Quin és el dni del client?");
			lector = new java.util.Scanner(System.in);
			String dni = lector.next();


			System.out.println("Quin és la direcció del client?");
			lector = new java.util.Scanner(System.in);
			String direccio = lector.next();

			//TODO Aquí s'ha de crear el nou client
			Client client = new Client(dni,nom,direccio);

			//TODO S'ha d'afegir el nou client a la cua
			cuaClients.add(client);
			//Si falla per excepció ja no tornarà true
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

}
